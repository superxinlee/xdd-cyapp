package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.ReptPort;
import com.xueduoduo.xddcyapp.entity.TExaminationItemUser;

import java.util.List;

/**
 * <p>
 * 学生答题表 服务类
 * </p>
 *
 * @author Tj123
 * @since 2018-11-14
 */
public interface TExaminationItemUserService extends IService<TExaminationItemUser> {
	/**
	 * 查询班级年级试卷报表
	 * @param examinationItemUser
	 * @return
	 */
	List<ReptPort> selectReptPort(TExaminationItemUser examinationItemUser);
	/**
	 * 查询试卷班级学生概况
	 * @param examinationItemUser
	 * @return
	 */
	List<TExaminationItemUser> selectClassReptPort(TExaminationItemUser examinationItemUser);
	/**
	 * 查询试卷班级学生详情
	 * @param examinationItemUser
	 * @return
	 */
	List<TExaminationItemUser> selectUserReptPort(TExaminationItemUser examinationItemUser);
}
