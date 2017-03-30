package com.jayce.food.dao;

import com.jayce.food.pojo.FoodTrack;
import com.jayce.food.pojo.FoodTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTrackMapper {
    long countByExample(FoodTrackExample example);

    int deleteByExample(FoodTrackExample example);

    int insert(FoodTrack record);

    int insertSelective(FoodTrack record);

    List<FoodTrack> selectByExample(FoodTrackExample example);

    int updateByExampleSelective(@Param("record") FoodTrack record, @Param("example") FoodTrackExample example);

    int updateByExample(@Param("record") FoodTrack record, @Param("example") FoodTrackExample example);
}