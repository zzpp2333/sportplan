package com.learn.sportplan.dao;

import com.learn.sportplan.bean.MainMenu;
import com.learn.sportplan.bean.Permission;
import com.learn.sportplan.bean.Role;
import com.learn.sportplan.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//调用Dao层完成数据库层的操作
@Repository
public interface UserDao {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
    public User getUserByUsername(String username);
    public List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public int getUserCounts(@Param("username") String username);

    // 根据主键id和状态码修改state
    public int updateState(Integer id, Boolean state);
    public int addUser(User user);
    // 通过主键删除
    public int deleteUser(int id);
    // 根据主键获得User对象
    public User getUserById(int id);
    public int updateUser(User user);
    public int updateRole(User user); //修改用户权限

    // 根据用户id查询角色信息
//    public List<Role> getRoles(@Param("userId") int userId);
    // 根据用户id查询菜单信息
//    public List<MainMenu> getMenus(@Param("userId") int userId);
    // 根据用户id查询权限信息
//    public List<Permission> getPermissions(@Param("userId") int userId);
}
