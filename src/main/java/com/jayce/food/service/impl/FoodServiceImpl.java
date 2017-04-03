package com.jayce.food.service.impl;

import com.jayce.food.dao.FoodMapper;
import com.jayce.food.dao.FoodTrackMapper;
import com.jayce.food.pojo.Food;
import com.jayce.food.pojo.FoodExample;
import com.jayce.food.pojo.FoodTrack;
import com.jayce.food.pojo.FoodTrackExample;
import com.jayce.food.service.def.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/2.
 */
@Transactional
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private FoodTrackMapper trackMapper;

    @Override
    public List<Food> getFoodListByFridge(Long fridgeId, Integer foodType, Integer storageMethod,
                                          Date manufactureTime, Integer pageIndex, Integer pageSize, Date timestamp) {
        FoodExample foodExample = createFoodExample(fridgeId, foodType, storageMethod, manufactureTime, pageIndex, pageSize, timestamp);
        return foodMapper.selectByExample(foodExample);
    }

    @Override
    public List<FoodTrack> getFoodTrackByFoodId(Long foodId) {
        return trackMapper.selectByExample(createFoodTrackExample(foodId));
    }

    private FoodExample createFoodExample(Long fridgeId, Integer foodType, Integer storageMethod,
                                          Date manufactureTime, Integer pageIndex, Integer pageSize, Date timestamp) {
        FoodExample example = new FoodExample();
        if (!(pageIndex == null || pageSize == null)) {
            example.setBeginIndex(pageIndex * pageSize);
            example.setPageSize(pageSize);
        }
        example.setOrderByClause("(manufacture_time + quality_time) - NOW()");
        FoodExample.Criteria criteria = example.createCriteria();
        criteria.andFridgeIdEqualTo(fridgeId);
        if (foodType != null) {
            criteria.andFoodTypeEqualTo(foodType);
        }
        if (storageMethod != null) {
            criteria.andStorageMethodEqualTo(storageMethod);
        }
        if (manufactureTime != null) {
            criteria.andManufactureTimeEqualTo(manufactureTime);
        }
        criteria.andBindTimeLessThanOrEqualTo(timestamp);
        criteria.andStatusEqualTo(true);
        return example;
    }

    private FoodTrackExample createFoodTrackExample(Long foodId) {
        FoodTrackExample example = new FoodTrackExample();
        FoodTrackExample.Criteria criteria = example.createCriteria();
        criteria.andFoodIdEqualTo(foodId);
        return example;
    }
}
