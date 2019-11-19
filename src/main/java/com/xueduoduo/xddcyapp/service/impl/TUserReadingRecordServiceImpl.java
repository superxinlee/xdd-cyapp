package com.xueduoduo.xddcyapp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xueduoduo.xddcyapp.entity.TUserReadingRecord;
import com.xueduoduo.xddcyapp.mapper.TUserReadingRecordDao;
import com.xueduoduo.xddcyapp.service.TUserReadingRecordService;
import com.xueduoduo.xddcyapp.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户阅读记录 服务实现类
 * </p>
 *
 * @author Tj123
 * @since 2019-05-06
 */
@Service
public class TUserReadingRecordServiceImpl extends ServiceImpl<TUserReadingRecordDao, TUserReadingRecord> implements TUserReadingRecordService {
    @Autowired
    private TUserReadingRecordDao dao;

    @Override
    public TUserReadingRecord save(Integer userId, String userCode, String userName, Integer classId, String className, Integer catalogId,
                                   Integer bookId, Integer grade) {
        TUserReadingRecord record = new TUserReadingRecord();
        record.setBookId(bookId);
        record.setCatalogId(catalogId);
        record.setClassId(classId);
        record.setClassName(className);
        record.setGrade(grade);
        record.setUserCode(userCode);
        record.setUserId(userId);
        record.setUserName(userName);
        record.setCreateTime(DateUtils.getStringDate());
        record.setDayOfMonth(DateUtils.getCurrentDayOfMonth());
        record.setMonth(DateUtils.getCurrentMonth());
        record.setYear(DateUtils.getCurrentYear());
        record.setWeekOfMonth(DateUtils.getCurrentWeekOfMonth());
        record.setWeekOfYear(DateUtils.getCurrentWeekOfYear());
        insert(record);
        return record;
    }

    @Override
    public List<TUserReadingRecord> selectUserReadingCount(Map<String, Object> map) {

        return dao.selectUserReadingCount(map);
    }

}
