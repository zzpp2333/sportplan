package com.learn.sportplan.dao;

import com.github.pagehelper.Page;
import com.learn.sportplan.bean.FoodType;

import java.util.List;

public interface FoodTypeDao {
    public Page<FoodType> getTypes(String query);
    public List<FoodType> getAllTypes();
    public FoodType getTypeByTitle(String title);
    public void insertFoodType(FoodType foodType);
    public void updateFoodType(FoodType foodType);
    public void deleteFoodType(Long id);
}
