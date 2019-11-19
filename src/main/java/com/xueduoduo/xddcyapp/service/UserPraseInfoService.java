package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.UserPraseInfo;

import java.util.List;

/**
 * <p>
 * 用户点赞作品记录表 服务类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-08
 */
public interface UserPraseInfoService extends IService<UserPraseInfo> {

	List<UserPraseInfo> selectCount(List<Integer> ids);
}
