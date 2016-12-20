package com.jayce.user.dao;

import com.jayce.pojo.user.SimpleUser;
import com.jayce.pojo.user.SimpleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimpleUserMapper {
    long countByExample(SimpleUserExample example);

    int deleteByExample(SimpleUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(SimpleUser record);

    int insertSelective(SimpleUser record);

    List<SimpleUser> selectByExample(SimpleUserExample example);

    SimpleUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SimpleUser record, @Param("example") SimpleUserExample example);

    int updateByExample(@Param("record") SimpleUser record, @Param("example") SimpleUserExample example);

    int updateByPrimaryKeySelective(SimpleUser record);

    int updateByPrimaryKey(SimpleUser record);
}