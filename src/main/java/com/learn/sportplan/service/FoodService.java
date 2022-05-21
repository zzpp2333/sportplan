package com.learn.sportplan.service;

import com.learn.sportplan.bean.Food;
import com.learn.sportplan.bean.FoodType;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;

import java.util.List;

public interface FoodService {
    Result getFoods(QueryInfo queryInfo);
    Result getFoodByTypeId(QueryInfo queryInfo);
    Result insertFood(Food food); //
    Result updateFood(Food food); //
    Result deleteFood(Long id); //

    Result getTypes(QueryInfo queryInfo);
    Result getAllTypes();
    Result insertFoodType(FoodType foodType);
    Result updateFoodType(FoodType foodType);
    Result deleteFoodType(Long id);
    Result batchImport(List<Food> list); // 批量导入
}
