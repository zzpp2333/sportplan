//package com.learn.sportplan.entity;
//
//import com.alibaba.excel.annotation.ExcelIgnore;
//import com.alibaba.excel.annotation.ExcelProperty;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//
//@Data
//public class Food1 {
//
//    @ExcelIgnore // 在导入excel文件时 排除该属性 不读取该属性的值
//    @ApiModelProperty("主键")
//    private int id;
//
//    @ExcelProperty("食物名称") // 在导入时读取excel对应的列信息
//    @ApiModelProperty("食物名称")
//    private String name;
//
//    @ExcelIgnore
//    @ApiModelProperty("食物类别id")
//    private int typeId;
//
//    @JsonIgnoreProperties
//    @ExcelProperty("食物类别")
//    @ApiModelProperty("食物类别")
//    private String type;
//
//    @ExcelIgnore
//    @ApiModelProperty("图片地址")
//    private String imageUrl;
//
//    @ExcelProperty("营养元素")
//    @ApiModelProperty("营养元素")
//    private String nutrient;
//
//    @ExcelProperty("热量")
//    @ApiModelProperty("热量")
//    private Float calories;
//
//    @ExcelProperty("蛋白质")
//    @ApiModelProperty("蛋白质")
//    private Float protein;
//
//    @ExcelProperty("脂肪")
//    @ApiModelProperty("脂肪")
//    private Float fat;
//
//    @ExcelProperty("碳水化合物")
//    @ApiModelProperty("碳水化合物")
//    private Float carbohydrate;
//
//    @ExcelProperty("膳食纤维")
//    @ApiModelProperty("膳食纤维")
//    private Float dietaryFiber;
//
//    @ExcelProperty("维生素A")
//    @ApiModelProperty("维生素A")
//    private Float vitaminA;
//
//    @ExcelProperty("维生素C")
//    @ApiModelProperty("维生素C")
//    private Float vitaminC;
//
//    @ExcelProperty("维生素E")
//    @ApiModelProperty("维生素E")
//    private Float vitaminE;
//
//    @ExcelProperty("胡萝卜素")
//    @ApiModelProperty("胡萝卜素")
//    private Float carotene;
//
//    @ExcelProperty("维生素B1")
//    @ApiModelProperty("维生素B1")
//    private Float vitaminB1;
//
//    @ExcelProperty("维生素B2")
//    @ApiModelProperty("维生素B2")
//    private Float vitaminB2;
//
//    @ExcelProperty("烟酸")
//    @ApiModelProperty("烟酸")
//    private Float niacin;
//
//    @ExcelProperty("胆固醇")
//    @ApiModelProperty("胆固醇")
//    private Float cholesterol;
//
//    @ExcelProperty("镁")
//    @ApiModelProperty("镁")
//    private Float magnesium;
//
//    @ExcelProperty("铁")
//    @ApiModelProperty("铁")
//    private Float iron;
//
//    @ExcelProperty("钙")
//    @ApiModelProperty("钙")
//    private Float calcium;
//
//    @ExcelProperty("锌")
//    @ApiModelProperty("锌")
//    private Float zinc;
//
//    @ExcelProperty("铜")
//    @ApiModelProperty("铜")
//    private Float copper;
//
//    @ExcelProperty("锰")
//    @ApiModelProperty("锰")
//    private Float manganese;
//
//    @ExcelProperty("钾")
//    @ApiModelProperty("钾")
//    private Float potassium;
//
//    @ExcelProperty("磷")
//    @ApiModelProperty("磷")
//    private Float phosphorus;
//
//    @ExcelProperty("钠")
//    @ApiModelProperty("钠")
//    private Float sodium;
//
//    @ExcelProperty("硒")
//    @ApiModelProperty("硒")
//    private Float selenium;
//}
