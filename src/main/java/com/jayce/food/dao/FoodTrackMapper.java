package com.jayce.food.dao;

import com.jayce.food.pojo.FoodTrack;
import com.jayce.food.pojo.FoodTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTrackMapper {
    long countByExample(FoodTrackExample example);

    int deleteByExample(FoodTrackExample example);

    int deleteByPrimaryKey(Long trackId);

    int insert(FoodTrack record);

    int insertSelective(FoodTrack record);

    List<FoodTrack> selectByExample(FoodTrackExample example);

    FoodTrack selectByPrimaryKey(Long trackId);

    int updateByExampleSelective(@Param("record") FoodTrack record, @Param("example") FoodTrackExample example);

    int updateByExample(@Param("record") FoodTrack record, @Param("example") FoodTrackExample example);

    int updateByPrimaryKeySelective(FoodTrack record);

    int updateByPrimaryKey(FoodTrack record);
}