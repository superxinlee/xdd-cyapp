package com.xueduoduo.xddcyapp.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xueduoduo.xddcyapp.entity.TExamination;
import com.xueduoduo.xddcyapp.entity.TExaminationItem;
import com.xueduoduo.xddcyapp.entity.TExaminationItemUser;
import com.xueduoduo.xddcyapp.entity.TExaminationParent;
import com.xueduoduo.xddcyapp.service.TExaminationItemService;
import com.xueduoduo.xddcyapp.service.TExaminationItemUserService;
import com.xueduoduo.xddcyapp.service.TExaminationParentService;
import com.xueduoduo.xddcyapp.service.TExaminationService;
import com.xueduoduo.xddcyapp.util.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 试卷表 前端控制器
 * </p>
 *
 * @author Tj123
 * @since 2018-11-12
 */
@RestController
@RequestMapping("/tExamination")
@Api(description = "试卷管理")
public class TExaminationController extends BaseController {
	@Autowired // 试卷service
	private TExaminationService examinationService;
	@Autowired
	private TExaminationParentService examItenParentService;
	@Autowired
	private TExaminationItemService examItenItemService;

	@Autowired
	private TExaminationItemUserService examItenItemUserService;

	@ApiOperation(value = "查询线上的试卷")
	@ApiImplicitParam(name = "grade", value = "年级", required = true, dataType = "int", paramType = "query")
	@RequestMapping(value = "/selectExamination", method = RequestMethod.POST)
	public Object selectExaminations(Integer grade) {
		EntityWrapper ew = new EntityWrapper<>();
		ew.where("status = {0}", 1).andNew("grade = {0}", grade);
		examinationService.selectOne(ew);
		return renderSuccess(examinationService.selectOne(ew));
	}

	@ApiOperation(value = "查询试卷详情")
	@ApiImplicitParam(name = "examId", value = "试卷id", required = true, dataType = "int", paramType = "query")
	@RequestMapping(value = "/selectExaminationInfo", method = RequestMethod.POST)
	public Object selectExaminationInfo(Integer examId) {
		TExamination examination = new TExamination();
		examination = examinationService.selectById(examId);
		List<TExaminationParent> examParents = new ArrayList<>();
		// 查询试卷下的大题 并放入对象中
		examParents = examItenParentService.selectList(
				new EntityWrapper<TExaminationParent>().where("examinationId = {0}", examId).and("isValid = {0}", 1));
		if (examParents != null) {
			// 查询大题下的小题，并放入对象中
			for (TExaminationParent examParent : examParents) {
				examParent.setExamItemList(examItenItemService.selectList(new EntityWrapper<TExaminationItem>()
						.where("examinationPid = {0}", examParent.getId()).and("isValid = {0}", 1)));
			}
		}
		examination.setExamParentList(examParents);
		return renderSuccess(examination);
	}

	@ApiOperation(value = "提交学生做题数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "userId", value = "学生id", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "userName", value = "学生名称", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "classId", value = "班级id", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "className", value = "班级名称", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "grade", value = "年级", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "gradeName", value = "年级名称", required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "examId", value = "试卷id", required = true, dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "examUser", value = "小题做题结果数组", required = true, dataType = "String", paramType = "query") })
	@RequestMapping(value = "/saveStudentExamItemCorrect", method = RequestMethod.POST)
	public Object saveStudentExamItemCorrect(Integer userId, String userName, Integer classId, String className,
			Integer grade, String gradeName, String examUser, Integer examId) {
			int count=examItenItemUserService.selectCount(
				new EntityWrapper<TExaminationItemUser>().where("userId={0}", userId).andNew("examId={0}", examId));
			if (count>0) {
				return renderSuccess("提交成功", "0");
			}
		JSONArray jsonArray = JSONArray.parseArray(examUser);
		List<TExaminationItemUser> examinationItemUsers = new ArrayList<>();
		String createTime = DateUtils.getStrCurrentYear();
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject json = jsonArray.getJSONObject(i);
			// 创建插入对象 并设置值
			TExaminationItemUser examinationItemUser = new TExaminationItemUser();
			examinationItemUser.setUserId(userId);
			examinationItemUser.setUserName(userName);
			examinationItemUser.setExamId(examId);
			examinationItemUser.setExamItemId(json.getInteger("examItemId"));
			examinationItemUser.setClassId(classId);
			examinationItemUser.setClassName(className);
			examinationItemUser.setGrade(grade);
			examinationItemUser.setGradeName(gradeName);
			examinationItemUser.setCreateTime(createTime);
			examinationItemUser.setDuration(json.getInteger("duration"));
			examinationItemUser.setErrorNum(json.getInteger("errorNum"));
			examinationItemUser.setExaminationPid(json.getInteger("examinationPid"));
			examinationItemUsers.add(examinationItemUser);
		}
		// 插入
		if (examinationItemUsers.size() > 0) {
			examItenItemUserService.insertBatch(examinationItemUsers);
		}
		return renderSuccess("提交成功", "0");
	}

}
