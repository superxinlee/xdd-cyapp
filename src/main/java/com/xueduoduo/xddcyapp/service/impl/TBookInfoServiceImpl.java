package com.xueduoduo.xddcyapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.entity.TBookContent;
import com.xueduoduo.xddcyapp.entity.TBookInfo;
import com.xueduoduo.xddcyapp.entity.TCatalog;
import com.xueduoduo.xddcyapp.mapper.TBookContentDao;
import com.xueduoduo.xddcyapp.mapper.TBookInfoDao;
import com.xueduoduo.xddcyapp.mapper.TCatalogDao;
import com.xueduoduo.xddcyapp.service.TBookInfoService;

/**
 * <p>
 * 绘本 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
@Service
public class TBookInfoServiceImpl extends ServiceImpl<TBookInfoDao, TBookInfo> implements TBookInfoService {

	@Autowired
	private TBookInfoDao bookInfoDao;
	@Autowired
	private TCatalogDao catalogDao;

	@Autowired
	private TBookContentDao bookContentDao;

	@Override
	public void deleteBook(Integer id) {

		// 删除书本内容
		EntityWrapper<TBookContent> wrapperContent = new EntityWrapper<>();
		wrapperContent.where("bookId={0}", id);
		bookContentDao.delete(wrapperContent);
		// 删除目录
		EntityWrapper<TCatalog> wrapper = new EntityWrapper<>();
		wrapper.where("bookId={0}", id);
		catalogDao.delete(wrapper);
		// 删除书
		bookInfoDao.deleteById(id);
	}

}
