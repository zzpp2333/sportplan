package com.learn.sportplan.service.impl;

import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.dao.UserDao;
import com.learn.sportplan.service.UserService;
import com.learn.sportplan.util.TokenUtil;
import com.learn.sportplan.vo.LoginVo;
import com.learn.sportplan.vo.UpdateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userServiceImpl")
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
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public Result getUserList(QueryInfo queryInfo) {
        // 获取 最大列表数 和 当前编号
        int numbers = userDao.getUserCounts("%"+queryInfo.getQuery()+"%");
        int pageStart = (queryInfo.getPageStart() - 1) * queryInfo.getPageSize();
        List<User> users = userDao.getAllUser("%"+queryInfo.getQuery()+"%", pageStart, queryInfo.getPageSize());
        return Result.success("获取用户列表成功", new PageResult<User>(numbers, users));
    }

    @Override
    public Result updateUserState(Integer id, Boolean state) {
        int res = userDao.updateState(id, state);
        return res > 0 ? Result.success("更新用户状态成功") : Result.fail("更新用户状态失败");
    }

    @Override
    public Result addUser(User user) {
        // 开始默认为 普通用户 并且为未启用状态 在超级管理员审核通过后才变为启用状态
        user.setRole("普通用户");
        user.setState(false);
        int res = userDao.addUser(user);
        return res > 0 ? Result.success("增加用户成功") : Result.fail("增加用户失败");
    }

    @Override
    public Result deleteUser(int id) {
        int res = userDao.deleteUser(id);
        return res > 0 ? Result.success("删除用户成功") : Result.fail("删除用户失败");
    }

    @Override
    public Result getUserById(int id) {
        User user = userDao.getUserById(id);
        return Result.success("编辑用户信息", user);
    }

    @Override
    public Result updateUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        int res = userDao.updateUser(user);
        return res > 0 ? Result.success("编辑用户信息成功") : Result.fail("编辑用户信息失败");
    }

    @Override
    public Result updateRole(User user) {
        int res = userDao.updateRole(user);
        return res > 0 ? Result.success("更新权限成功") : Result.fail("更新权限失败");
    }
}
