package com.learn.sportplan.service.impl;

import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//实现UserDetailsService接口 实现自定义登录
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        根据用户名获取用户信息
        User user = userDao.getUserByUsername(username);
        System.out.println(user);
        if(null == user){
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return user;
    }
}
