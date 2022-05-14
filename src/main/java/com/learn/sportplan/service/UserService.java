package com.learn.sportplan.service;

import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.User;
import com.learn.sportplan.vo.LoginVo;

public interface UserService {
    public Result login(LoginVo loginVo);  // 根据登录参数（用户名、密码）进行登录
    public User getUserByUsername(String username);  // 根据username查询用户
    public Result getUserList(QueryInfo queryInfo);  // 根据queryInfo进行模糊查询 获得查询结果
    public Result updateUserState(Integer id, Boolean state);  // 更改用户的 启用/禁用 状态
    public Result addUser(User user);  // 增加用户
    public Result deleteUser(int id); // 根据id删除用户
    public Result getUserById(int id); // 根据id获取用户信息
    public Result updateUser(User user); // 更新用户信息
    public Result updateRole(User user); // 更新用户的权限
//    public void changePassword(String username, String oldPassword, String newPassword);
}
