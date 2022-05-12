package com.learn.sportplan.bean;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User实体
 */
@Data
public class User implements UserDetails {
    private int id; //主键 自增
    private String username; //用户名
    private String password; //密码
    private String email; //邮件
    private String role; //角色 一个用户只有一个角色 一个角色有多个权限，可以访问多种页面资源 如果role直接设置为Role类型 那么当更改role时 Role也需要重新设置
    private boolean state; //状态
    private List<Role> roleList;

    public User(){
        //空构造
    }
    // id为数据库自增 因此构造方法不需要传入id

    public User(String username, String password, String email, String role, boolean state, List<Role> roleList) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.state = state;
        this.roleList = roleList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 权限数据
        List<GrantedAuthority> authorities = new ArrayList<>();
        this.roleList.parallelStream().forEach(role1 -> {
            authorities.add(new SimpleGrantedAuthority(role1.getName()));
        });
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        // 账号是否过期
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        // 账号是否被锁定
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // 凭证是否过期
        return false;
    }

    @Override
    public boolean isEnabled() {
        // 是否启用
        return this.state;
    }
}
