package com.jayce.dao.family;

import com.jayce.pojo.family.Family;
import com.jayce.pojo.family.FamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyMapper {
    long countByExample(FamilyExample example);

    int deleteByExample(FamilyExample example);

    int insert(Family record);

    int insertSelective(Family record);

    List<Family> selectByExample(FamilyExample example);

    int updateByExampleSelective(@Param("record") Family record, @Param("example") FamilyExample example);

    int updateByExample(@Param("record") Family record, @Param("example") FamilyExample example);
}