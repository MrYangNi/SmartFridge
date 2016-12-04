package com.jayce.dao.fridge;

import com.jayce.pojo.fridge.Fridge;
import com.jayce.pojo.fridge.FridgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FridgeMapper {
    long countByExample(FridgeExample example);

    int deleteByExample(FridgeExample example);

    int insert(Fridge record);

    int insertSelective(Fridge record);

    List<Fridge> selectByExample(FridgeExample example);

    int updateByExampleSelective(@Param("record") Fridge record, @Param("example") FridgeExample example);

    int updateByExample(@Param("record") Fridge record, @Param("example") FridgeExample example);
}