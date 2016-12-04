package com.jayce.service.impl.test;

import com.jayce.dao.test.DBTestMapper;
import com.jayce.service.def.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jaycejia on 2016/12/3.
 */
@Transactional
@Service("testService")
public class TestServiceImpl implements TestService{
    @Autowired
    private DBTestMapper testMapper;
    public String getMessage() throws Exception{
        return testMapper.selectMessage();
    }
}
