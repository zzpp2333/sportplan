package com.learn.sportplan.service;

import com.learn.sportplan.bean.Permission;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;

public interface PermissionService {
    public Result getPermissions(QueryInfo queryInfo); // 查询权限
    public Result addPermission(Permission permission); // 添加权限
    public Result updatePermission(Permission permission); // 修改权限
    public Result deletePermission(Long id); // 删除权限
}
