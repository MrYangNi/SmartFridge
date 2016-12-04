package com.jayce.pojo.food;

import java.util.Date;

public class Food {
    private Long foodId;

    private Long tagId;

    private Long fridgeId;

    private String foodName;

    private Long foodType;

    private Long storageMethod;

    private String manufacturer;

    private Date manufactureTime;

    private Long qualityTime;

    private Long status;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getFridgeId() {
        return fridgeId;
    }

    public void setFridgeId(Long fridgeId) {
        this.fridgeId = fridgeId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Long getFoodType() {
        return foodType;
    }

    public void setFoodType(Long foodType) {
        this.foodType = foodType;
    }

    public Long getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(Long storageMethod) {
        this.storageMethod = storageMethod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Date getManufactureTime() {
        return manufactureTime;
    }

    public void setManufactureTime(Date manufactureTime) {
        this.manufactureTime = manufactureTime;
    }

    public Long getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(Long qualityTime) {
        this.qualityTime = qualityTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}