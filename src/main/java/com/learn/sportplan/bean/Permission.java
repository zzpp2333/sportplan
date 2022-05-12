package com.learn.sportplan.bean;

import lombok.Data;

@Data
public class Permission {
    /** 数据权限标签名 标签值 */
    private int id;
    private String name;
    private String permission;

    public Permission() {
    }

    public Permission(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }
}
