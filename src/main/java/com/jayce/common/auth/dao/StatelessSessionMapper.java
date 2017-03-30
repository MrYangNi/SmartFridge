package com.jayce.common.auth.dao;

import com.jayce.common.auth.pojo.StatelessSession;
import com.jayce.common.auth.pojo.StatelessSessionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StatelessSessionMapper {
    long countByExample(StatelessSessionExample example);

    int deleteByExample(StatelessSessionExample example);

    int deleteByPrimaryKey(String clientId);

    int insert(StatelessSession record);

    int insertSelective(StatelessSession record);

    List<StatelessSession> selectByExample(StatelessSessionExample example);

    StatelessSession selectByPrimaryKey(String clientId);

    int updateByExampleSelective(@Param("record") StatelessSession record, @Param("example") StatelessSessionExample example);

    int updateByExample(@Param("record") StatelessSession record, @Param("example") StatelessSessionExample example);

    int updateByPrimaryKeySelective(StatelessSession record);

    int updateByPrimaryKey(StatelessSession record);
}