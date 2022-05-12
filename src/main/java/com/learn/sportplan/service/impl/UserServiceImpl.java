package com.learn.sportplan.service.impl;

import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import com.learn.sportplan.service.UserService;
import com.learn.sportplan.util.TokenUtil;
import com.learn.sportplan.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public Result login(LoginVo loginVo) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(loginVo.getUsername());
        if(null == userDetails || !passwordEncoder.matches(loginVo.getPassword(), userDetails.getPassword())){
            // 判断用户是否存在 密码是否正确
            return Result.fail("账号或密码错误, 请重新输入");
        }
        if(!userDetails.isEnabled()){
            // 判断账号是否禁用
            return Result.fail("该账号已禁用, 请联系管理员");
        }
        // 登录成功 在security对象中存入登录信息
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        // 根据登录信息获取token
        String token = tokenUtil.generateToken(userDetails);
        Map<String, String> map = new HashMap<>(2);
        map.put("tokenHead", tokenHead);
        map.put("token", token);
        return Result.success("登录成功", map);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.getUserByUsername(username);
    }
}
