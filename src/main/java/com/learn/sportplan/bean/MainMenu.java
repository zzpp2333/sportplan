package com.learn.sportplan.bean;

import lombok.Data;

import java.util.List;

@Data
public class MainMenu {
    private int id;
    private String title;
    private String path;
    private String icon;
    private List<SubMenu> subList;

    public MainMenu() {
    }

    public MainMenu(String title, String path, String icon, List<SubMenu> subList) {
        this.title = title;
        this.path = path;
        this.icon = icon;
        this.subList = subList;
    }
}
