package com.xueduoduo.xddcyapp.service.impl;

import com.xueduoduo.xddcyapp.entity.ReptPort;
import com.xueduoduo.xddcyapp.entity.TExaminationItemUser;
import com.xueduoduo.xddcyapp.mapper.TExaminationItemUserDao;
import com.xueduoduo.xddcyapp.service.TExaminationItemUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生答题表 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2018-11-14
 */
@Service
public class TExaminationItemUserServiceImpl extends ServiceImpl<TExaminationItemUserDao, TExaminationItemUser> implements TExaminationItemUserService {

	@Autowired
	private TExaminationItemUserDao dao;
	
	@Override
	public List<ReptPort> selectReptPort(TExaminationItemUser examinationItemUser) {
		// TODO Auto-generated method stub
		return dao.selectReptPort(examinationItemUser);
	}

	@Override
	public List<TExaminationItemUser> selectClassReptPort(TExaminationItemUser examinationItemUser) {
		// TODO Auto-generated method stub
		return dao.selectClassReptPort(examinationItemUser);
	}

	@Override
	public List<TExaminationItemUser> selectUserReptPort(TExaminationItemUser examinationItemUser) {
		// TODO Auto-generated method stub
		return  dao.selectUserReptPort(examinationItemUser);
	}

}
