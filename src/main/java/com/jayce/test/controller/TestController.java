package com.jayce.test.controller;

import com.jayce.pojo.test.TestPO;
import com.jayce.test.service.def.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Jaycejia on 2016/12/3.
 */
@RestController
public class TestController {
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