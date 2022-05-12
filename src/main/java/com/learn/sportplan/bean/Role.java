package com.learn.sportplan.bean;

import lombok.Data;

import java.util.List;

@Data
public class Role {
    /** 角色id 标签名 标签值 角色对应的菜单列表 角色对应的数据权限 */
    private int id;
    private String name; //
    private String remark;
    private List<MainMenu> menus;
    private List<Permission> permissions;

    public Role() {
    }

    public Role(String name, String remark, List<MainMenu> menus, List<Permission> permissions) {
        this.name = name;
        this.remark = remark;
        this.menus = menus;
        this.permissions = permissions;
    }
}
