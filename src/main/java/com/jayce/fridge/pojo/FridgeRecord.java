package com.jayce.fridge.pojo;

import java.util.Date;

public class FridgeRecord {
    private Long recordId;

    private Long fridgeId;

    private Long foodId;

    private Integer operation;

    private Date operateTime;

    public FridgeRecord() {
    }

    public FridgeRecord(Long fridgeId, Long foodId, Integer operation, Date operateTime) {
        this.fridgeId = fridgeId;
        this.foodId = foodId;
        this.operation = operation;
        this.operateTime = operateTime;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getFridgeId() {
        return fridgeId;
    }

    public void setFridgeId(Long fridgeId) {
        this.fridgeId = fridgeId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}