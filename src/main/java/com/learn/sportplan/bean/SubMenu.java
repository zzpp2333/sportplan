package com.learn.sportplan.bean;

import lombok.Data;

// 分支导航
@Data
public class SubMenu {
    private int id;
    private String title;
    private String path;
    private String icon;
    private String component;

    public SubMenu() {
    }

    public SubMenu(String title, String component, String path, String icon) {
        this.title = title;
        this.path = path;
        this.icon = icon;
        this.component = component;
    }

}
