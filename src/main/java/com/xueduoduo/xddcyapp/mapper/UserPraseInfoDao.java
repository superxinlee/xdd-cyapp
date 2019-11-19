package com.xueduoduo.xddcyapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xueduoduo.xddcyapp.entity.UserPraseInfo;

/**
 * <p>
 * 用户点赞作品记录表 Mapper 接口
 * </p>
 *
 * @author Tj123
 * @since 2019-05-08
 */
public interface UserPraseInfoDao extends BaseMapper<UserPraseInfo> {

	List<UserPraseInfo> selectCount(@Param("ids") List<Integer> ids);
}
