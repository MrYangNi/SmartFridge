package com.jayce.test.controller;

import com.jayce.test.pojo.TestPO;
import com.jayce.test.service.def.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Jaycejia on 2016/12/3.
 */
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String getMessage(@RequestBody TestPO testPO) throws Exception{
        String result = testService.getMessage() + "   " + testPO.toString();
//        throw new Exception("异常：" + result);
        return result;
    }

    @RequestMapping(value = "/test/date",method = RequestMethod.GET)
    public Date echoDate(Date date) {
        return date;
    }
}
