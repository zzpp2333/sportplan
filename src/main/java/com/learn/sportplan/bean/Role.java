package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Role {
    /** 角色id 标签名 标签值 角色对应的菜单列表 角色对应的数据权限 */
    @ApiModelProperty(value = "主键")
    private int id;

    @ApiModelProperty(value = "角色标签")
    private String name; //

    @ApiModelProperty(value = "角色名")
    private String remark;

    @ApiModelProperty(value = "菜单列表")
    private List<MainMenu> menus;

    @ApiModelProperty(value = "权限列表")
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
