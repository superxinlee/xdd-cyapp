package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.TUserReadingRecord;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户阅读记录 服务类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
public interface TUserReadingRecordService extends IService<TUserReadingRecord> {

	TUserReadingRecord save(Integer userId, String userCode, String userName, Integer classId, String className, Integer catalogId,
                            Integer bookId, Integer grade);

	/**
	 * 获取用户某一目录或目录集合阅读次数
	 * 
	 * 
	 * @param map
	 *            (参数userId 和Integer集合catalogIds)
	 * @return
	 */
    List<TUserReadingRecord> selectUserReadingCount(Map<String, Object> map);
}
