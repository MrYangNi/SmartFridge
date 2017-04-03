package com.jayce.food.controller;

import com.jayce.food.pojo.Food;
import com.jayce.food.pojo.FoodListRsp;
import com.jayce.food.pojo.FoodTrack;
import com.jayce.food.service.def.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/2.
 */
@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public FoodListRsp getFoodList(Long fridgeId, Integer foodType, Integer storageMethod,
                                   Date manufactureTime, Integer pageIndex, Integer pageSize,
                                   Date timestamp) {
        if (timestamp == null) {
            timestamp = new Date();
        }
        List<Food> foodList = foodService.getFoodListByFridge(fridgeId, foodType, storageMethod, manufactureTime, pageIndex, pageSize,
                timestamp);
        return new FoodListRsp(timestamp, foodList);
    }

    @RequestMapping(value = "/food/track/{foodId}", method = RequestMethod.GET)
    public List<FoodTrack> getFoodTrack(@PathVariable Long foodId) {
        return foodService.getFoodTrackByFoodId(foodId);
    }
}
