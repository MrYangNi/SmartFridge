package com.jayce.family.dao;

import com.jayce.family.pojo.Family;
import com.jayce.family.pojo.FamilyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FamilyMapper {
    long countByExample(FamilyExample example);

    int deleteByExample(FamilyExample example);

    int deleteByPrimaryKey(Long familyId);

    int insert(Family record);

    int insertSelective(Family record);

    List<Family> selectByExample(FamilyExample example);

    Family selectByPrimaryKey(Long familyId);

    int updateByExampleSelective(@Param("record") Family record, @Param("example") FamilyExample example);

    int updateByExample(@Param("record") Family record, @Param("example") FamilyExample example);

    int updateByPrimaryKeySelective(Family record);

    int updateByPrimaryKey(Family record);
}