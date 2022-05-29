package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Sport {

    @ApiModelProperty("主键")
    private int id;

    @ApiModelProperty("运动名称")
    private String name;

    @ApiModelProperty("创建者Id")
    private int creatorId;

    @ApiModelProperty("适合的年龄")
    private String applicableAge;

    @ApiModelProperty("收益的部位")
    private String beneficialPosition;

    @ApiModelProperty("运动科普")
    private String introduction;
}
