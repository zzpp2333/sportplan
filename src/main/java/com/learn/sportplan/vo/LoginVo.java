package com.learn.sportplan.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "登录参数")
public class LoginVo {
    // value object 对应页面显示的数据对象
    @ApiModelProperty(value = "用户名", dataType = "String", required = true)
    private String username;

    @ApiModelProperty(value = "密码", dataType = "String", required = true)
    private String password;
}
