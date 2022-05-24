package com.learn.sportplan.controller;

import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中
@RestController
@RequestMapping("/user")
@Api(tags = "用户信息")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

//    RequestMapping: 将请求和处理请求的控制器方法关联起来
    @RequestMapping("/allUser")
    @ApiOperation(value = "获取用户信息列表")
    public Result getUserList(QueryInfo queryInfo){
        return userService.getUserList(queryInfo);
//        HashMap<String, Object> res = new HashMap<>();
//        res.put("numbers", numbers);
//        res.put("data", users);
//        return JSON.toJSONString(res);
    }

    @RequestMapping("/userState")
    @ApiOperation(value = "获取用户状态")
    public Result updateUserState(@RequestParam("id") Integer id, @RequestParam("state") Boolean state){
        return userService.updateUserState(id, state);
    }

    @RequestMapping("/addUser")
    @ApiOperation(value = "添加用户")
    public Result addUser(@RequestBody User user){
//        开始默认为 普通用户 并且为未启用状态 在超级管理员审核通过后才变为启用状态
        return userService.addUser(user);
    }

    @RequestMapping("/deleteUser")
    @ApiOperation(value = "删除用户")
    public Result deleteUser(int id){
        return userService.deleteUser(id);
    }

    @RequestMapping("/getUpdate")
    @ApiOperation(value = "根据id获取要更新的用户信息")
    public Result getUpdateUser(int id){
        return userService.getUserById(id);
    }

    @RequestMapping("/updateUser")
    @ApiOperation(value = "修改用户信息")
    public Result updateUser(@RequestBody User user){
//        System.out.println(user);
        return userService.updateUser(user);
    }

    @RequestMapping("/updateRole")
    @ApiOperation(value = "修改用户角色")
    public Result updateRole(@RequestBody User user){
//        System.out.println(user);
        return userService.updateRole(user);
    }
}
