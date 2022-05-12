package com.learn.sportplan.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class TokenUtil {
//    token工具类 用于生成token 用户拿到token后访问系统资源
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expiration;

    public String generateToken(UserDetails details){
        // 传入用户登录信息 生成token
        Map<String, Object> map = new HashMap<>(2);
        map.put("username", details.getUsername());
        map.put("created", new Date());
        return this.generateJwt(map);
    }

    public String generateJwt(Map<String, Object> map){
        return Jwts.builder()
                .setClaims(map)
                .signWith(SignatureAlgorithm.HS512, secret)
                .setExpiration(new Date(System.currentTimeMillis() + expiration * 1000))
                .compact();
    }

    public Claims getTokenBody(String token){
//        获取荷载信息
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }catch(Exception e){
            return null;
        }
    }

    public String getUsernameByToken(String token){
//        根据token得到用户名
        return (String)this.getTokenBody(token).get("username");
    }

    public boolean isExpiration(String token){
//        判断当前时间内 token是否过期
        return this.getTokenBody(token).getExpiration().before(new Date());
    }

    public String refreshToken(String token){
//        刷新token
        Claims claims = this.getTokenBody(token);
        claims.setExpiration(new Date());
        return this.generateJwt(claims);
    }
}
