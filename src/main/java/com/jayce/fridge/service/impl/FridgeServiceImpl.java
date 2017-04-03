package com.jayce.fridge.service.impl;

import com.jayce.fridge.dao.FridgeMapper;
import com.jayce.fridge.dao.FridgeRecordMapper;
import com.jayce.fridge.pojo.Fridge;
import com.jayce.fridge.pojo.FridgeRecord;
import com.jayce.fridge.pojo.FridgeRecordExample;
import com.jayce.fridge.service.def.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/3.
 */
@Transactional
@Service
public class FridgeServiceImpl implements FridgeService {
    @Autowired
    private FridgeMapper fridgeMapper;
    @Autowired
    private FridgeRecordMapper recordMapper;

    @Override
    public void addFridge(Fridge fridge) {
        fridge.setStatus(true);
        fridgeMapper.insert(fridge);
    }

    @Override
    public List<FridgeRecord> getFridgeRecords(Long fridgeId, Integer pageIndex, Integer pageSize, Date timestamp) {
        FridgeRecordExample example = new FridgeRecordExample();
        example.setOrderByClause("operate_time DESC");
        example.setBeginIndex(pageIndex * pageSize);
        example.setPageSize(pageSize);
        FridgeRecordExample.Criteria criteria = example.createCriteria();
        criteria.andFridgeIdEqualTo(fridgeId);
        criteria.andOperateTimeLessThanOrEqualTo(timestamp);
        return recordMapper.selectByExample(example);
    }

}
