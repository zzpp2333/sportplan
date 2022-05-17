package com.learn.sportplan.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.Permission;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.dao.PermissionDao;
import com.learn.sportplan.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public Result getPermissions(QueryInfo queryInfo) {
        // 使用PageHelper进行分页
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<Permission> page = permissionDao.getPermissions(queryInfo.getQuery());
        long total = page.getTotal(); // 查询的总条数
        List<Permission> result = page.getResult(); // 分页结果
        return new PageResult(total, result);
    }

    @Override
    public Result addPermission(Permission permission) {
        permissionDao.addPermission(permission);
        return Result.success("添加权限数据成功");
    }

    @Override
    public Result updatePermission(Permission permission) {
        permissionDao.updatePermission(permission);
        return Result.success("修改权限数据成功");
    }

    @Override
    public Result deletePermission(Long id) {
        permissionDao.deletePermission(id);
        return Result.success("删除权限数据成功");
    }
}
