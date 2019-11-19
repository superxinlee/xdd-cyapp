package com.xueduoduo.xddcyapp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xueduoduo.xddcyapp.entity.TUserReadingRecord;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户阅读记录 Mapper 接口
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
public interface TUserReadingRecordDao extends BaseMapper<TUserReadingRecord> {

	List<TUserReadingRecord> selectUserReadingCount(Map<String, Object> map);
}
