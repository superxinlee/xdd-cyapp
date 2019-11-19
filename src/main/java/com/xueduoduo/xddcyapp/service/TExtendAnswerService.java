package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.TExtendAnswer;

/**
 * <p>
 * 用户拓展活动答案 服务类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
public interface TExtendAnswerService extends IService<TExtendAnswer> {

	boolean saveAnswer(Integer id, Integer userId, String userCode, String userName, Integer classId, String className, Integer catalogId,
                       Integer bookId, Integer grade, String answerContent);
}
