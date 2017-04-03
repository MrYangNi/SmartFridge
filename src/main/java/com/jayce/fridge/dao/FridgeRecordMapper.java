package com.jayce.fridge.dao;

import com.jayce.fridge.pojo.FridgeRecord;
import com.jayce.fridge.pojo.FridgeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FridgeRecordMapper {
    long countByExample(FridgeRecordExample example);

    int deleteByExample(FridgeRecordExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(FridgeRecord record);

    int insertSelective(FridgeRecord record);

    List<FridgeRecord> selectByExample(FridgeRecordExample example);

    FridgeRecord selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") FridgeRecord record, @Param("example") FridgeRecordExample example);

    int updateByExample(@Param("record") FridgeRecord record, @Param("example") FridgeRecordExample example);

    int updateByPrimaryKeySelective(FridgeRecord record);

    int updateByPrimaryKey(FridgeRecord record);
}