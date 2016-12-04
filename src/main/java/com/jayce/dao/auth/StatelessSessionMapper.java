package com.jayce.dao.auth;

import com.jayce.pojo.auth.StatelessSession;
import com.jayce.pojo.auth.StatelessSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatelessSessionMapper {
    long countByExample(StatelessSessionExample example);

    int deleteByExample(StatelessSessionExample example);

    int insert(StatelessSession record);

    int insertSelective(StatelessSession record);

    List<StatelessSession> selectByExample(StatelessSessionExample example);

    int updateByExampleSelective(@Param("record") StatelessSession record, @Param("example") StatelessSessionExample example);

    int updateByExample(@Param("record") StatelessSession record, @Param("example") StatelessSessionExample example);
}