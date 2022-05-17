package com.learn.sportplan.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.learn.sportplan.util.CustomAuthorityDeserializer;
import io.swagger.annotations.ApiModelProperty;
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
@JsonIgnoreProperties({"enabled","accountNonExpired", "accountNonLocked", "credentialsNonExpired", "authorities"})
public class User implements UserDetails {

    @ApiModelProperty(value = "主键")
    private int id; //主键 自增

    @ApiModelProperty(value = "用户名")
    private String username; //用户名

    @ApiModelProperty(value = "登陆密码")
    private String password; //密码

    @ApiModelProperty(value = "邮件")
    private String email; //邮件

    @ApiModelProperty(value = "角色")
    private String role; //角色 一个用户只有一个角色 一个角色有多个权限，可以访问多种页面资源

    @ApiModelProperty(value = "状态")
    private boolean state; //状态

    @ApiModelProperty(value = "角色列表")
    private List<Role> roleList; // 在从数据库中获取User时 会根据role从关联的role roles_menus roles_permissions表中获得相关信息

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
    @JsonDeserialize(using = CustomAuthorityDeserializer.class)
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 权限数据
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(this.roleList != null && this.roleList.size() > 0){
            this.roleList.parallelStream().forEach(role1 -> {
                authorities.add(new SimpleGrantedAuthority(role1.getName()));
                List<Permission> permissions = role1.getPermissions();
                if(permissions != null && permissions.size() > 0) {
                    permissions.forEach(permission -> {
                        authorities.add(new SimpleGrantedAuthority(permission.getPermission()));
                    });
                }
            });
        }
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
