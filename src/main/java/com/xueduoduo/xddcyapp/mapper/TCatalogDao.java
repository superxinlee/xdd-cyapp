package com.xueduoduo.xddcyapp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xueduoduo.xddcyapp.entity.TCatalog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 书本目录 Mapper 接口
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
public interface TCatalogDao extends BaseMapper<TCatalog> {
	/**
	 * 查出所有父目录
	 * 
	 * @return
	 */
    List<TCatalog> selectAllCatalog(@Param("bookId") Integer bookId);

	/**
	 * 查出所有字目录
	 * 
	 * @param pid
	 * @return
	 */
    List<TCatalog> selectChildrenByPid(Integer pid);

}
