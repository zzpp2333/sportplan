package com.learn.sportplan.service;

import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.vo.LoginVo;

public interface UserService {
    public Result login(LoginVo loginVo);  // 根据登录参数（用户名、密码）进行登录
    User findByUsername(String username);
}
