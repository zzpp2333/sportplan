package com.learn.sportplan.service.impl;

import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
//        从数据库中把User查出来，然后放到SecurityContextHolder（security框架的用户凭证的维护中心，里面维护了security的上下文信息、已经登录用户的权限、用户凭证等等信息）
//        根据用户名获取用户信息
        User user = userDao.getUserByUsername(username);
//        System.out.println(user);
        if(null == user){
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return user;
    }
}
