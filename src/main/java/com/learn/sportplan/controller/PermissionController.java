package com.learn.sportplan.controller;

import com.learn.sportplan.bean.Permission;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//权限数据控制层
@RestController  // @Controller + @ResponseBody
@Api(tags = "权限数据")
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @ApiOperation(value = "查询权限数据")
    @PostMapping("/allPermission")
    public Result getPermissions(@RequestBody QueryInfo queryInfo){
        return permissionService.getPermissions(queryInfo);
    }

    @ApiOperation(value = "添加权限数据")
    @PostMapping("/addPermission")
    public Result addPermission(@RequestBody Permission permission){
        return permissionService.addPermission(permission);
    }

    @ApiOperation(value = "编辑权限数据")
    @PostMapping("/updatePermission")
    public Result updatePermission(@RequestBody Permission permission){
        return permissionService.updatePermission(permission);
    }

    @ApiOperation(value = "删除权限数据")
    @DeleteMapping("/deletePermission/{id}")
    public Result deletePermission(@PathVariable("id") Long id){
        return permissionService.deletePermission(id);
    }
}
