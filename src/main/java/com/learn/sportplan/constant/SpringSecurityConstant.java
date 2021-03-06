package com.learn.sportplan.constant;

//白名单
public class SpringSecurityConstant {
    public static final String[] WHILE_LIST = {
            // 后端登录接口
            "/login",
            "/logout",

            //swagger相关
            "/doc.html",
            "/favicon.ico",
            "/swagger-ui.html",
            "/webjars/**",
            "/swagger-resources/**",
            "/v2/**",
            "/configuration/ui",
            "/configuration/security",
    };
}
