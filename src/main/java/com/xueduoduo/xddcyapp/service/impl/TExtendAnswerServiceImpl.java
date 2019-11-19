package com.xueduoduo.xddcyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.util.DateUtils;
import com.xueduoduo.xddcyapp.entity.ClassInfo;
import com.xueduoduo.xddcyapp.entity.TCatalog;
import com.xueduoduo.xddcyapp.entity.TExtendAnswer;
import com.xueduoduo.xddcyapp.mapper.ClassInfoDao;
import com.xueduoduo.xddcyapp.mapper.TCatalogDao;
import com.xueduoduo.xddcyapp.mapper.TExtendAnswerDao;
import com.xueduoduo.xddcyapp.service.TExtendAnswerService;

/**
 * <p>
 * 用户拓展活动答案 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
@Service
public class TExtendAnswerServiceImpl extends ServiceImpl<TExtendAnswerDao, TExtendAnswer> implements TExtendAnswerService {

	@Autowired
	private ClassInfoDao classInfoDao;
	@Autowired
	private TCatalogDao catalogDao;

	@Override
	public boolean saveAnswer(Integer id, Integer userId, String userCode, String userName, Integer classId, String className, Integer catalogId,
			Integer bookId, Integer grade, String answerContent) {
		EntityWrapper<ClassInfo> entityWrapper = new EntityWrapper<>();
		entityWrapper.where("classId={0}", classId);
		List<ClassInfo> classList = classInfoDao.selectList(entityWrapper);

		if (classList == null || classList.size() <= 0) {
			ClassInfo classInfo = new ClassInfo();
			classInfo.setClassId(classId);
			classInfo.setClassName(className);
			classInfoDao.insert(classInfo);
		}
		TCatalog selectById = catalogDao.selectById(catalogId);
		if (selectById == null) {
			return false;
		}

		EntityWrapper<TExtendAnswer> wrapper = new EntityWrapper<>();
		wrapper.where("bookId={0}", bookId).andNew("catalogId={0}", catalogId).andNew("userId={0}", userId);
		delete(wrapper);
		// 记录用户答案
		TExtendAnswer answer = new TExtendAnswer();
		answer.setBookId(bookId);
		answer.setCatalogId(catalogId);
		answer.setClassId(classId);
		answer.setClassName(className);
		answer.setGrade(grade);
		answer.setUserCode(userCode);
		answer.setUserId(userId);
		answer.setUserName(userName);
		answer.setCreateTime(DateUtils.getStringDate());
		answer.setDayOfMonth(DateUtils.getCurrentDayOfMonth());
		answer.setMonth(DateUtils.getCurrentMonth());
		answer.setYear(DateUtils.getCurrentYear());
		answer.setWeekOfMonth(DateUtils.getCurrentWeekOfMonth());
		answer.setWeekOfYear(DateUtils.getCurrentWeekOfYear());
		answer.setAnswerContent(answerContent);
		return insertOrUpdate(answer);

	}

}
