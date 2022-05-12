package com.learn.sportplan.config;

import com.learn.sportplan.bean.User;
import com.learn.sportplan.config.handler.JwtAccessDeniedHandler;
import com.learn.sportplan.config.handler.JwtAuthenticationEntryPoint;
import com.learn.sportplan.config.handler.JwtAuthenticationFilter;
import com.learn.sportplan.constant.SpringSecurityConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter { //权限基本配置

    @Autowired
    private UserDetailsService userDetailService;

    @Autowired
    private JwtAuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    private JwtAccessDeniedHandler accessDeniedHandler;

    @Autowired
    private JwtAuthenticationFilter authenticationFilter;

    @Override
    public void configure(WebSecurity web) throws Exception { // 配置白名单（即没有权限也可以访问的资源 例如登录）
        web.ignoring().mvcMatchers(SpringSecurityConstant.WHILE_LIST);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { // Security的核心配置
//        使用jwt 关闭跨域攻击
        http.csrf().disable();
//        关闭session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        请求需要认证之后才能访问（白名单除外）
        http.authorizeRequests().anyRequest().authenticated();
//        关闭缓存
        http.headers().cacheControl();
//        token过滤器 校验token
        http.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
//        没有登录或没有权限访问资源时的自定义返回结果
        http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).accessDeniedHandler(accessDeniedHandler);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { // 自定义登录逻辑的配置
        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
