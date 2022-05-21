package com.learn.sportplan.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.learn.sportplan.bean.*;
import com.learn.sportplan.dao.FoodDao;
import com.learn.sportplan.dao.FoodTypeDao;
import com.learn.sportplan.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;

    @Autowired
    private FoodTypeDao foodTypeDao;

    @Override
    public Result getFoods(QueryInfo queryInfo) {
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<Food> foods = foodDao.getFoods(queryInfo.getQuery());
        long total = foods.getTotal();
        List<Food> result = foods.getResult();
        return new PageResult(total, result);
    }

    @Override
    public Result getFoodByTypeId(QueryInfo queryInfo) {
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<Food> foods = foodDao.getFoodByTypeId(queryInfo.getQuery());
        long total = foods.getTotal();
        List<Food> result = foods.getResult();
        return new PageResult(total, result);
    }

    @Override
    public Result insertFood(Food food) {
        foodDao.insertFood(food);
        return Result.success("添加食物信息成功");
    }

    @Override
    public Result updateFood(Food food) {
        foodDao.updateFood(food);
        return Result.success("修改食物信息成功");
    }

    @Override
    public Result deleteFood(Long id) {
        foodDao.deleteFood(id);
        return Result.success("删除食物信息成功");
    }

    @Override
    public Result getTypes(QueryInfo queryInfo) {
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<FoodType> types = foodTypeDao.getTypes(queryInfo.getQuery());
        long total = types.getTotal();
        List<FoodType> result = types.getResult();
        return new PageResult(total, result);
    }

    @Override
    public Result getAllTypes() {
        List<FoodType> result = foodTypeDao.getAllTypes();
        return Result.success("获取全部食物分类成功", result);
    }

    @Override
    public Result insertFoodType(FoodType foodType) {
        foodTypeDao.insertFoodType(foodType);
        return Result.success("添加食物分类信息成功");
    }

    @Override
    public Result updateFoodType(FoodType foodType) {
        foodTypeDao.updateFoodType(foodType);
        return Result.success("修改食物分类信息成功");
    }

    @Override
    public Result deleteFoodType(Long id) {
        foodTypeDao.deleteFoodType(id);
        return Result.success("删除食物分类信息成功");
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Result batchImport(List<Food> list) {
        List<Food> foods = new ArrayList<>();
        // 读取分类
        for(Food food : list){
            FoodType foodType = foodTypeDao.getTypeByTitle(food.getType());
            Food sameName = foodDao.getFoodByName(food.getName());
            if(null != foodType){
                if(null != sameName){ // 如果数据库中已经存在 则进行修改
                    foodDao.updateFood(food);
                }else { // 如果不存在 则设置food的typeId字段 将其存入数据库
                    food.setTypeId(foodType.getId());
//                    foodDao.insertFood(food); // 不一条一条添加 直接批量添加
                    foods.add(food);
                }
            }
        }
        foodDao.insertFoodList(foods);
        return Result.success("批量导入成功");
    }
}
