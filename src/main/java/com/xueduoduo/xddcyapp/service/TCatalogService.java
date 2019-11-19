package com.xueduoduo.xddcyapp.service;

import com.baomidou.mybatisplus.service.IService;
import com.xueduoduo.xddcyapp.entity.TCatalog;

import java.util.List;

/**
 * <p>
 * 书本目录 服务类
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
public interface TCatalogService extends IService<TCatalog> {

	/**
	 * 查出书的所有目录
	 * 
	 * @param bookId
	 * @return
	 */
    List<TCatalog> selectAllCatalog(Integer bookId);

	/**
	 * 删除目录及其子目录
	 * 
	 * @param id
	 */
    void deleteCatalog(Integer id);

}
