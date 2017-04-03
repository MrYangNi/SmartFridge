package com.jayce.fridge.service.def;

import com.jayce.fridge.pojo.Fridge;
import com.jayce.fridge.pojo.FridgeRecord;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/3.
 */
public interface FridgeService {
    void addFridge(Fridge fridge);

    List<FridgeRecord> getFridgeRecords(Long fridgeId, Integer pageIndex, Integer pageSize, Date timestamp);
}
