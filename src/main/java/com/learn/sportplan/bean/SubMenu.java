package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

// 分支导航
@Data
public class SubMenu {

    @ApiModelProperty(value = "主键")
    private int id;

    @ApiModelProperty(value = "子菜单标题")
    private String title;

    @ApiModelProperty(value = "子菜单路径")
    private String path;

    @ApiModelProperty(value = "子菜单图标")
    private String icon;

    @ApiModelProperty(value = "组件路径")
    private String component;

    @ApiModelProperty(value = "启用状态")
    private boolean state;

    public SubMenu() {
    }

    public SubMenu(String title, String component, String path, String icon, boolean state) {
        this.title = title;
        this.path = path;
        this.icon = icon;
        this.component = component;
        this.state = state;
    }

}
