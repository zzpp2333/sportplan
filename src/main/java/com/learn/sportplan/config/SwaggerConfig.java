package com.learn.sportplan.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@EnableKnife4j
@EnableWebMvc // 需要此注解 否则报错Failed to start bean 'documentationPluginsBootstrapper'; nested exception is java.lang.NullPointerException
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){  // 创建接口文档
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learn.sportplan.controller"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts());
    }

    private ApiInfo apiInfo(){ // 设置文档信息
        return new ApiInfoBuilder().
                title("个人运动管理平台").
                version("1.0.0")
                .contact(new Contact("me", "http://localhost:9000/doc.html", "wxxxzhang@163.com"))
                .description("个人运动管理平台接口文档")
                .build();
    }

    private List<ApiKey> securitySchemes(){ // 设置请求头信息
        List<ApiKey> list = new ArrayList<>();
        ApiKey key = new ApiKey("Authorization", "Authorization", "Header");
        list.add(key);
        return list;
    }

    private List<SecurityContext> securityContexts(){ // 配置security对swagger测试的权限
        List<SecurityContext> list = new ArrayList<>();
        list.add(getSecurityContext());
        return list;
    }

    private SecurityContext getSecurityContext(){  // 获取授权路径
        return SecurityContext
                .builder()
                .securityReferences(securityReferences())
                .forPaths(PathSelectors.regex("/hello/.*"))
                .build();
    }

    private List<SecurityReference> securityReferences(){
        List<SecurityReference> list = new ArrayList<>();
        AuthorizationScope scope = new AuthorizationScope("global", "accessEverything"); // 授权范围为全局
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = scope;
        list.add(new SecurityReference("Authorization", authorizationScopes));
        return list;
    }
}
