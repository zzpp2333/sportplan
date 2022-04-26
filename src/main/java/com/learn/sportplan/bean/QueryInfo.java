package com.learn.sportplan.bean;

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

    public String getQuery() {
        return query;
    }

    public int getPageStart() {
        return pageStart;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "QueryInfo{" +
                "query='" + query + '\'' +
                ", pageStart=" + pageStart +
                ", pageSize=" + pageSize +
                '}';
    }
}
