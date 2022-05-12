package com.learn.sportplan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //说明它是全局配置类
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 1.域访问路径
         * 2.请求来源
         * 3.方法
         * 4.允许携带token
         * 5.最大响应时间
         */
        registry.addMapping("/**")  //允许跨域请求的域名
                .allowedOrigins("http://localhost:8080", "null") //来源
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE") //允许跨域的方法
                .allowCredentials(true) //允许携带信息
                .allowedHeaders("*")
                .maxAge(3600); //最大相应时间

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //EnableWebMvc配置可能会造成 swagger 的 ui 页面无法打开所以需要重新指定静态资源
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
