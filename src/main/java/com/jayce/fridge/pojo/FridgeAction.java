package com.jayce.fridge.pojo;

import com.jayce.food.pojo.Food;

import java.util.Date;

/**
 * Created by Jaycejia on 2017/4/4.
 */
public class FridgeAction {
    public static final int IN = 0;
    public static final int OUT = 1;
    private Integer actionCode;
    private Fridge fridge;
    private Food food;
    private Date time;

    public FridgeAction() {
    }

    public FridgeAction(Fridge fridge, Food food, Date time) {
        this.fridge = fridge;
        this.food = food;
        this.time = time;
    }

    public static int getIN() {
        return IN;
    }

    public static int getOUT() {
        return OUT;
    }

    public Integer getActionCode() {
        return actionCode;
    }

    public void setActionCode(Integer actionCode) {
        this.actionCode = actionCode;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
