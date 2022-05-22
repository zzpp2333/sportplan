package com.learn.sportplan.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.learn.sportplan.bean.Food;
import com.learn.sportplan.bean.FoodType;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.service.FoodService;
import com.learn.sportplan.util.QiniuUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/food")
@Api(tags = "食物信息")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private QiniuUtil qiniuUtil;

    @ApiOperation(value = "通过excel批量导入")
    @PostMapping("/batchImport")
    public Result batchImport(@RequestParam("file") MultipartFile file){
        try{
            ImportParams params = new ImportParams();
            List<Food> list = ExcelImportUtil.importExcel(file.getInputStream(), Food.class, params);
            list.forEach(item -> {
                if(StringUtils.isNotEmpty(item.getImageUrl())){
                    try {
                        FileInputStream inputStream = new FileInputStream(item.getImageUrl());
                        String uuid = UUID.randomUUID().toString().substring(0, 7);
                        int index = item.getImageUrl().lastIndexOf(".");
                        String suffix = item.getImageUrl().substring(index);
                        String upload = qiniuUtil.uploadQiniu(inputStream, uuid+suffix);
                        item.setImageUrl(upload);
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
            });
            return foodService.batchImport(list);
        } catch (Exception e){
            e.printStackTrace();
            return Result.fail("食物信息批量导入失败");
        }
    }

    @ApiOperation(value = "添加菜品分类")
    @PostMapping("/type/insert")
    public Result insertFoodType(@RequestBody FoodType foodType){
        return foodService.insertFoodType(foodType);
    }

    @ApiOperation(value = "删除菜品分类")
    @DeleteMapping("/type/delete/{id}")
    public Result deleteFoodType(@PathVariable Long id){
        return foodService.deleteFoodType(id);
    }

    @ApiOperation(value = "修改菜品分类")
    @PostMapping("/type/update")
    public Result updateFoodType(@RequestBody FoodType foodType){
        return foodService.updateFoodType(foodType);
    }

    @ApiOperation(value = "查询食物分类以及各类别包含的菜品")
    @PostMapping("/type/getTypes")
    public Result getTypes(@RequestBody QueryInfo queryInfo){
        return foodService.getTypes(queryInfo);
    }

    @ApiOperation(value = "查询所有食物分类")
    @GetMapping("/type/all")
    public Result getAllTypes(){
        return foodService.getAllTypes();
//        if(null != queryInfo.getQuery() && !queryInfo.getQuery().equals("")){
//            queryInfo.setQuery("");
//        }
//        return foodService.getTypes(queryInfo);
    }

    @ApiOperation(value = "查询所有食物")
    @PostMapping("/getFoods")
    public Result getFoods(@RequestBody QueryInfo queryInfo){
        return foodService.getFoods(queryInfo);
    }

    @ApiOperation(value = "添加菜品")
    @PostMapping("/insert")
    public Result insertFood(@RequestBody Food food){
        return foodService.insertFood(food);
    }

    @ApiOperation(value = "修改菜品")
    @PostMapping("/update")
    public Result updateFood(@RequestBody Food food){
        return foodService.updateFood(food);
    }

    @ApiOperation(value = "删除菜品")
    @DeleteMapping("/delete/{id}")
    public Result deleteFood(@PathVariable Long id){
        return foodService.deleteFood(id);
    }

    @ApiOperation(value = "根据食物类别查询食物")
    @PostMapping("/getFoodById")
    public Result getFoodByTypeId(@RequestBody QueryInfo queryInfo){
        return foodService.getFoodByTypeId(queryInfo);
    }
}
