package com.learn.sportplan.bean;

import lombok.Data;

@Data
//把 分页、模糊查询 所需的参数都封装到QueryInfo实体中
public class QueryInfo {
    private String query; // 查询信息 username/goodName
    private int pageStart = 1; // 当前页
    private int pageSize = 1; //

    public QueryInfo() {
    }

    public QueryInfo(String query, int pageStart, int pageSize) {
        this.query = query;
        this.pageStart = pageStart;
        this.pageSize = pageSize;
    }

}
