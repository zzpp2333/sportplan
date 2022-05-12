package com.learn.sportplan.util;

import com.learn.sportplan.bean.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil { // 获取当前登录用户的基本信息

    // 从Security主体信息中获取用户信息
    public static User getUser(){
        return (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static String getUsername(){
        return getUser().getUsername();
    }

    public static int getUserId(){
        return getUser().getId();
    }
}
