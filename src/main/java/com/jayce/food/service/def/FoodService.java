package com.jayce.food.service.def;

import com.jayce.food.pojo.Food;
import com.jayce.food.pojo.FoodTrack;

import java.util.Date;
import java.util.List;

/**
 * Created by Jaycejia on 2017/4/2.
 */
public interface FoodService {
    List<Food> getFoodListByFridge(Long fridgeId, Integer foodType,
                                   Integer storageMethod, Date manufactureTime, Integer pageIndex, Integer pageSize,
                                   Date timestamp);

    List<FoodTrack> getFoodTrackByFoodId(Long foodId);
}
