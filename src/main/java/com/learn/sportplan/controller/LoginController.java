package com.learn.sportplan.controller;

import com.alibaba.fastjson.JSON;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController //返回String类型
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag = "error";
        User us = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        System.out.println("user: "+us);
        if(us != null){
            flag = "ok";
        }
        HashMap<String, Object> res = new HashMap<>();
        res.put("flag", flag);
        res.put("user", us);
        String resJson = JSON.toJSONString(res);
        System.out.println(resJson);
        return resJson;
    }
}
