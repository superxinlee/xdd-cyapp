package com.xueduoduo.xddcyapp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.entity.PageModel;
import com.xueduoduo.xddcyapp.entity.TExamination;
import com.xueduoduo.xddcyapp.mapper.TExaminationDao;
import com.xueduoduo.xddcyapp.service.TExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 试卷表 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2018-12-07
 */
@Service
public class TExaminationServiceImpl extends ServiceImpl<TExaminationDao, TExamination> implements TExaminationService {

    @Autowired
    private TExaminationDao dao;


    /**
     * 分页查询卷子
     *
     * @param pageModel
     * @return
     */
    @Override
    public List<TExamination> selectExaminationList(PageModel pageModel) {
        // TODO Auto-generated method stub
        return dao.selectExaminationList(pageModel);
    }

}
