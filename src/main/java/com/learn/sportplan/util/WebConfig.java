package com.learn.sportplan.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration //说明它是全局配置类
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 1.域访问路径
         * 2.请求来源
         * 3.方法
         * 4.允许携带token
         * 5.最大响应时间
         */
        registry.addMapping("/**")  //允许
                .allowedOrigins("Http://localhost:8080", "null") //来源
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE") //允许跨域的方法
                .allowCredentials(true) //允许携带信息
                .maxAge(3600); //最大相应时间

    }
}
