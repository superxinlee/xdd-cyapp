package com.xueduoduo.xddcyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.entity.UserPraseInfo;
import com.xueduoduo.xddcyapp.mapper.UserPraseInfoDao;
import com.xueduoduo.xddcyapp.service.UserPraseInfoService;

/**
 * <p>
 * 用户点赞作品记录表 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-08
 */
@Service
public class UserPraseInfoServiceImpl extends ServiceImpl<UserPraseInfoDao, UserPraseInfo> implements UserPraseInfoService {
	@Autowired
	private UserPraseInfoDao userPraseInfodao;

	@Override
	public List<UserPraseInfo> selectCount(List<Integer> ids) {
		return userPraseInfodao.selectCount(ids);
	}

}
