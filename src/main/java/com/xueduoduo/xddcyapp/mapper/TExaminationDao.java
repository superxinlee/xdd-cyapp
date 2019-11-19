package com.xueduoduo.xddcyapp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xueduoduo.xddcyapp.entity.PageModel;
import com.xueduoduo.xddcyapp.entity.TExamination;

import java.util.List;

/**
 * <p>
 * 试卷表 Mapper 接口
 * </p>
 *
 * @author Tj123
 * @since 2018-12-07
 */
public interface TExaminationDao extends BaseMapper<TExamination> {
	/**
	 * 分页查询卷子
	 * @param pageModel
	 * @return
	 */
	List<TExamination> selectExaminationList(PageModel pageModel);
}
