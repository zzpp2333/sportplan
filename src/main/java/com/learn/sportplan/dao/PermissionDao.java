package com.learn.sportplan.dao;

import com.github.pagehelper.Page;
import com.learn.sportplan.bean.Permission;

// 权限数据的增删改查
public interface PermissionDao {
    Page<Permission> getPermissions(String query);
    public void addPermission(Permission permission);  // 添加权限信息
    public void updatePermission(Permission permission);
    public void deletePermission(Long id);
}
