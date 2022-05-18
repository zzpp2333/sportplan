package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Permission {
    /** 数据权限标签名 标签值 */
    @ApiModelProperty(value = "主键")
    private int id;

    @ApiModelProperty(value = "权限名")
    private String name;

    @ApiModelProperty(value = "权限标签")
    private String permission;

    @ApiModelProperty(value = "启用状态")
    private boolean state;

    public Permission() {
    }

    public Permission(String name, String permission, boolean state) {
        this.name = name;
        this.permission = permission;
        this.state = state;
    }
}
