package com.jayce.fridge.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/4.
 */
public class FridgeRecordRsp {
    private Date timestamp;
    private List<FridgeRecord> recordList;

    public FridgeRecordRsp() {
    }

    public FridgeRecordRsp(Date timestamp, List<FridgeRecord> recordList) {
        this.timestamp = timestamp;
        this.recordList = recordList;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<FridgeRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<FridgeRecord> recordList) {
        this.recordList = recordList;
    }
}
