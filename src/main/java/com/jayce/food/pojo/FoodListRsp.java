package com.jayce.food.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/2.
 */
public class FoodListRsp {
    private Date timestamp;
    private List<Food> foodList;

    public FoodListRsp() {
    }

    public FoodListRsp(Date timestamp, List<Food> foodList) {
        this.timestamp = timestamp;
        this.foodList = foodList;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
