package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class MainMenu {

    @ApiModelProperty(value = "主键")
    private int id;

    @ApiModelProperty(value = "菜单标题")
    private String title;

    @ApiModelProperty(value = "菜单路径")
    private String path;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "子菜单列表")
    private List<SubMenu> subList;

    @ApiModelProperty(value = "启用状态")
    private boolean state;

    public MainMenu() {
    }

    public MainMenu(String title, String path, String icon, List<SubMenu> subList, boolean state) {
        this.title = title;
        this.path = path;
        this.icon = icon;
        this.subList = subList;
        this.state = state;
    }
}
