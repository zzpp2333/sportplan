package com.learn.sportplan.bean;

import java.util.List;

public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> subList;

    public MainMenu() {
    }

    public MainMenu(String title, String path, List<SubMenu> subList) {
        this.title = title;
        this.path = path;
        this.subList = subList;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public List<SubMenu> getSubList() {
        return subList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSubList(List<SubMenu> subList) {
        this.subList = subList;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", subList=" + subList +
                '}';
    }
}
