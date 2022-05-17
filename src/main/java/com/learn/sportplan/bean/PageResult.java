package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult extends Result implements Serializable {
    /**
     * 分页结果：总记录数、分页列表
     */
    @ApiModelProperty("总记录数")
    private long total;

    @ApiModelProperty("分页数据列表")
    private List<?> rows;

    public PageResult(long total, List<?> rows) {
        this.setFlag(true);
        this.setMessage("分页数据");
        this.total = total;
        this.rows = rows;
    }

    public static Result pageResult(long total, List<?> list){
        return new PageResult(total, list);
    }
}
