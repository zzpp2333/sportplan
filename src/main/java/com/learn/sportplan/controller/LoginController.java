package com.learn.sportplan.controller;

import com.alibaba.fastjson.JSON;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import com.learn.sportplan.service.UserService;
import com.learn.sportplan.util.SecurityUtil;
import com.learn.sportplan.vo.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;

@RestController //返回String类型
@Api(tags = "用户登陆接口")
public class LoginController {

//    @Autowired
//    UserDao userDao;
//
//    @Autowired
//    private UserDetailsService userDetailsService;

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public Result login(@RequestBody LoginVo loginVo){
        return userService.login(loginVo);
    }

    @ApiOperation(value = "获取用户基本信息")
    @GetMapping("/getUserInfo")
    public Result getUserInfo(){
        return Result.success("获取用户信息成功", SecurityUtil.getUser());
    }

    @ApiOperation(value = "用户退出登录")
    @GetMapping("/logout")
    public Result logout(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(null != authentication){
            SecurityContextHolder.getContext().setAuthentication(null);
        }
        return Result.success("退出成功");
    }

//    public String login(@RequestBody LoginVo loginVo){
//        String flag = "error";
//        User us = userDao.getUserByMessage(loginVo.getUsername(), loginVo.getPassword());
//        System.out.println("user: "+us);
//        if(us != null){
//            flag = "ok";
//        }
//        HashMap<String, Object> res = new HashMap<>();
//        res.put("flag", flag);
//        res.put("user", us);
//        String resJson = JSON.toJSONString(res);
//        System.out.println(resJson);
//        return resJson;
//    }
}
