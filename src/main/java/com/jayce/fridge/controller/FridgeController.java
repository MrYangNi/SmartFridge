package com.jayce.fridge.controller;

import com.jayce.fridge.pojo.Fridge;
import com.jayce.fridge.pojo.FridgeRecord;
import com.jayce.fridge.pojo.FridgeRecordRsp;
import com.jayce.fridge.service.def.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/3.
 */
@RestController
public class FridgeController {
    @Autowired
    private FridgeService fridgeService;

    @RequestMapping(value = "/fridge", method = RequestMethod.POST)
    public String addFridge(@RequestBody Fridge fridge) {
        fridgeService.addFridge(fridge);
        return "绑定冰箱成功";
    }

    @RequestMapping(value = "/fridge/history", method = RequestMethod.GET)
    public FridgeRecordRsp getRecords(Long fridgeId, Integer pageIndex, Integer pageSize, Date timestamp) {
        if (timestamp == null) {
            timestamp = new Date();
        }
        List<FridgeRecord> records = fridgeService.getFridgeRecords(fridgeId, pageIndex, pageSize, timestamp);
        return new FridgeRecordRsp(timestamp, records);
    }

}
