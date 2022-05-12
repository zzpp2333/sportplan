package com.learn.sportplan.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private int id; // 主键id 自增
    private String goodName; // 商品名
    private BigDecimal price; // 商品价格
    private int inStock; // 商品库存 默认为0
    private int createUserId;  // 创建者id 默认为1
    private String imgUrl; // 图片地址
    private String modelType; // 适配机型
    private String controlMode; // 控制方式
    private String mainFunction; // 主要功能
    private String wifiFunction; // 无线功能
    private String battery;  // 电池规格
    private String characteristic;  // 特色功能
    private String size; // 外观尺寸
    private String other; // 其他功能
    private String remark; // 备注

    public Goods() {
    }

    public Goods(String goodName, BigDecimal price, int inStock, int createUserId, String imgUrl, String modelType,
                 String controlMode, String mainFunction, String wifiFunction, String battery, String characteristic,
                 String size, String other, String remark) {
        this.goodName = goodName;
        this.price = price;
        this.inStock = inStock;
        this.createUserId = createUserId;
        this.imgUrl = imgUrl;
        this.modelType = modelType;
        this.controlMode = controlMode;
        this.mainFunction = mainFunction;
        this.wifiFunction = wifiFunction;
        this.battery = battery;
        this.characteristic = characteristic;
        this.size = size;
        this.other = other;
        this.remark = remark;
    }
}
