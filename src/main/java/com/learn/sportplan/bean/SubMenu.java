package com.learn.sportplan.bean;

import lombok.Data;

// 分支导航
@Data
public class SubMenu {
    private int id;
    private String title;
    private String path;

    public SubMenu() {
    }

    public SubMenu(String title, String path) {
        this.title = title;
        this.path = path;
    }

}
