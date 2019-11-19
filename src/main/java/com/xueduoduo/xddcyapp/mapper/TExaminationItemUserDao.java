package com.xueduoduo.xddcyapp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xueduoduo.xddcyapp.entity.ReptPort;
import com.xueduoduo.xddcyapp.entity.TExaminationItemUser;

import java.util.List;

/**
 * <p>
 * 学生答题表 Mapper 接口
 * </p>
 *
 * @author Tj123
 * @since 2018-11-14
 */
public interface TExaminationItemUserDao extends BaseMapper<TExaminationItemUser> {
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
