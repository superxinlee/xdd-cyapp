package com.xueduoduo.xddcyapp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.entity.TBookContent;
import com.xueduoduo.xddcyapp.entity.TCatalog;
import com.xueduoduo.xddcyapp.mapper.TBookContentDao;
import com.xueduoduo.xddcyapp.mapper.TCatalogDao;
import com.xueduoduo.xddcyapp.service.TCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 书本目录 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2019-03-20
 */
@Service
public class TCatalogServiceImpl extends ServiceImpl<TCatalogDao, TCatalog> implements TCatalogService {

    @Autowired
    private TCatalogDao tCatalogDao;
    @Autowired
    private TBookContentDao boookContentDao;

    @Override
    public List<TCatalog> selectAllCatalog(Integer bookId) {
        // // TODO 算法可以进行 优化 查询所有 将所有记录 按Pid 进行归类 PID 为0的是根目录
        // List<TCatalog> allCatalog = tCatalogDao.selectAllCatalog(bookId);
        //
        // if (allCatalog == null || allCatalog.size() < 1) {
        // return null;
        // }
        // for (TCatalog tCatalog : allCatalog) {
        // selectChildren(tCatalog);
        // }
        // return allCatalog;
        Map<Integer, List<TCatalog>> map = new HashMap<>();
        List<TCatalog> allCatalog = tCatalogDao.selectAllCatalog(bookId);
        if (allCatalog == null || allCatalog.size() <= 0) {
            return null;
        }
        for (TCatalog tCatalog : allCatalog) {
            List<TCatalog> list = map.get(tCatalog.getpId());
            Integer pid = tCatalog.getpId();
            if (list != null && list.size() >= 1) {
                list.add(tCatalog);
                map.put(pid, list);
            } else {
                list = new ArrayList<>();
                list.add(tCatalog);
                map.put(pid, list);
            }
        }
        List<TCatalog> rootList = map.get(0);
        getTree(rootList, map);
        return rootList;
    }

    private void getTree(List<TCatalog> rootList, Map<Integer, List<TCatalog>> map) {
        for (TCatalog tCatalog : rootList) {
            List<TCatalog> list = map.get(tCatalog.getId());
            if (list == null || list.size() <= 0) {
                return;
            }
            tCatalog.setChildren(list);
            getTree(list, map);
        }
    }

    private void selectChildren(TCatalog tCatalog) {
        List<TCatalog> children = tCatalogDao.selectChildrenByPid(tCatalog.getId());
        if (children == null || children.size() < 1) {
            return;
        }
        tCatalog.setChildren(children);
        for (TCatalog tCatalog2 : children) {
            selectChildren(tCatalog2);
        }
    }

    @Override
    public void deleteCatalog(Integer id) {
        List<TCatalog> byPid = tCatalogDao.selectChildrenByPid(id);
        if (byPid == null || byPid.size() < 1) {
            tCatalogDao.deleteById(id);
            EntityWrapper<TBookContent> wrapperContent = new EntityWrapper<>();
            wrapperContent.where("catalogId={0}", id);
            boookContentDao.delete(wrapperContent);
            return;
        }
        for (TCatalog tCatalog : byPid) {
            deleteCatalog(tCatalog.getId());
        }
    }

}
