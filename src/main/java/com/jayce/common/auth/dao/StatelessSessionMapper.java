package com.jayce.common.auth.dao;

import com.jayce.pojo.auth.StatelessSession;
import com.jayce.pojo.auth.StatelessSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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