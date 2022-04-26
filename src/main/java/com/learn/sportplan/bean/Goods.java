package com.learn.sportplan.bean;

import java.math.BigDecimal;

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

    public int getId() {
        return id;
    }

    public String getGoodName() {
        return goodName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getModelType() {
        return modelType;
    }

    public String getControlMode() {
        return controlMode;
    }

    public String getMainFunction() {
        return mainFunction;
    }

    public String getWifiFunction() {
        return wifiFunction;
    }

    public String getBattery() {
        return battery;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String getSize() {
        return size;
    }

    public String getOther() {
        return other;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }

    public void setMainFunction(String mainFunction) {
        this.mainFunction = mainFunction;
    }

    public void setWifiFunction(String wifiFunction) {
        this.wifiFunction = wifiFunction;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", createUserId=" + createUserId +
                ", imgUrl='" + imgUrl + '\'' +
                ", modelType='" + modelType + '\'' +
                ", controlModel='" + controlMode + '\'' +
                ", mainFunction='" + mainFunction + '\'' +
                ", wifiFunction='" + wifiFunction + '\'' +
                ", battery='" + battery + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", size='" + size + '\'' +
                ", other='" + other + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
