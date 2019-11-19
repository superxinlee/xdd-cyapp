package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.TBookInfo;

/**
 * <p>
 * 绘本 服务类
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
public interface TBookInfoService extends IService<TBookInfo> {

	/**
	 * 删除书 及 书本目录 及 书本内容
	 * 
	 * @param id
	 */
    void deleteBook(Integer id);

}
