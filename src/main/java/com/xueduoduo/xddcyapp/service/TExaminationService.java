package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.PageModel;
import com.xueduoduo.xddcyapp.entity.TExamination;

import java.util.List;

/**
 * <p>
 * 试卷表 服务类
 * </p>
 *
 * @author Tj123
 * @since 2018-12-07
 */
public interface TExaminationService extends IService<TExamination> {
	/**
	 * 分页查询卷子
	 * @param pageModel
	 * @return
	 */
	List<TExamination> selectExaminationList(PageModel pageModel);
}
