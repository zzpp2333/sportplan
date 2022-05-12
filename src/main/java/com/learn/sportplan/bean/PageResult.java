package com.learn.sportplan.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends Result implements Serializable {
    /**
     * 分页结果：总记录数、分页列表
     */
    private long total;
    private List<T> rows;

    public PageResult(long total, List<T> rows) {
        this.setFlag(true);
        this.setMessage("分页数据");
        this.total = total;
        this.rows = rows;
    }
}
