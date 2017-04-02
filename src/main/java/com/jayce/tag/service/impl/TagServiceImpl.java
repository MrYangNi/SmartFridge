package com.jayce.tag.service.impl;

import com.jayce.common.exception.ResourceNotFoundException;
import com.jayce.food.dao.FoodMapper;
import com.jayce.food.pojo.Food;
import com.jayce.food.pojo.FoodExample;
import com.jayce.fridge.dao.FridgeMapper;
import com.jayce.fridge.pojo.Fridge;
import com.jayce.fridge.pojo.FridgeExample;
import com.jayce.tag.service.def.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by Jaycejia on 2017/4/1.
 */
@Transactional
@Service
public class TagServiceImpl implements TagService {
    private final static Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);
    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private FridgeMapper fridgeMapper;

    @Override
    public void onTag(String tagId, String fridgeSN) {
        List<Food> foodList = foodMapper.selectByExample(createFoodExample(tagId));
        List<Fridge> fridgeList = fridgeMapper.selectByExample(createFridgeExample(fridgeSN));
        if (foodList == null || foodList.size() == 0) {
            throw new ResourceNotFoundException("找不到tag绑定的食物");
        }
        if (fridgeList == null || fridgeList.size() == 0) {
            throw new ResourceNotFoundException("找不到冰箱");
        }
        Food food = foodList.get(0);
        Fridge fridge = fridgeList.get(0);
        if (food.getFoodId() == null || !Objects.equals(food.getFridgeId(), fridge.getFridgeId())) {//未绑定冰箱或者更换冰箱
            processFood(food, fridge, 0);
            logger.debug("将食物: {}放入冰箱: {}", food, fridge);
        } else {
            processFood(food, fridge, 1);
            logger.debug("将食物: {}从冰箱: {}移除", food, fridge);
        }
    }

    private void processFood(Food food, Fridge fridge, int operation) {
        if (operation == 0) {//将食物添加到冰箱
            food.setFridgeId(fridge.getFridgeId());
            food.setBindTime(new Date());
        } else {//将食物和冰箱解除绑定
            food.setFridgeId(null);
        }
        foodMapper.updateByPrimaryKey(food);
    }

    private FoodExample createFoodExample(String tagId) {
        FoodExample example = new FoodExample();
        FoodExample.Criteria criteria = example.createCriteria();
        criteria.andTagIdEqualTo(tagId);
        criteria.andStatusEqualTo(true);
        return example;
    }

    private FridgeExample createFridgeExample(String fridgeSn) {
        FridgeExample example = new FridgeExample();
        FridgeExample.Criteria criteria = example.createCriteria();
        criteria.andFridgeSnEqualTo(fridgeSn);
        criteria.andStatusEqualTo(true);
        return example;
    }
}
