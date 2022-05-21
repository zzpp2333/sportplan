package com.learn.sportplan.dao;

import com.github.pagehelper.Page;
import com.learn.sportplan.bean.Food;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodDao {
    public Page<Food> getFoods(String query);
    public Food getFoodByName(String name);
    public Page<Food> getFoodByTypeId(String id);
    public void insertFood(Food food);
    public void updateFood(Food food);
    public void deleteFood(Long id);

    void insertFoodList(@Param("foods") List<Food> foods);  // 批量添加
}
