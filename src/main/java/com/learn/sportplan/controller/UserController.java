package com.learn.sportplan.controller;

import com.alibaba.fastjson.JSON;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/allUser")
    public String getUserList(QueryInfo queryInfo){
        // 获取 最大列表树 和 当前编号
        int numbers = userDao.getUserCounts("%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageStart() - 1) * queryInfo.getPageSize();
        List<User> users = userDao.getAllUser("%"+queryInfo.getQuery()+"%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers", numbers);
        res.put("data", users);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/userState")
    public String updateUserState(@RequestParam("id") Integer id, @RequestParam("state") Boolean state){
        int i = userDao.updateState(id, state);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
//        开始默认为 普通用户 并且为未启用状态 在超级管理员审核通过后才变为启用状态
        user.setRole("普通用户");
        user.setState(false);
        int res = userDao.addUser(user);
        return res > 0 ? "success" : "error";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int res = userDao.deleteUser(id);
        return res > 0 ? "success" : "error";
    }

    @RequestMapping("/getUpdate")
    public String getUpdateUser(int id){
        User user = userDao.getUpdateUser(id);
//        System.out.println(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user){
//        System.out.println(user);
        int res = userDao.updateUser(user);
        return res > 0 ? "success" : "error";
    }

    @RequestMapping("/updateRole")
    public String updateRole(@RequestBody User user){
//        System.out.println(user);
        int res = userDao.updateRole(user);
//        System.out.println(i);
        return res > 0 ? "success" : "error";
    }
}
