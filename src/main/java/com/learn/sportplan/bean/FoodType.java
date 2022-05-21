package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class FoodType {

    @ApiModelProperty("主键")
    private int id;

    @ApiModelProperty("分类名")
    private String title;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("该分类下的食物列表")
    private List<Food> foods;
}
