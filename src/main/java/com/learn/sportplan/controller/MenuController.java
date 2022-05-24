package com.learn.sportplan.controller;

import com.alibaba.fastjson.JSON;
import com.learn.sportplan.bean.MainMenu;
import com.learn.sportplan.dao.MenuDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@Api(tags = "菜单列表")
public class MenuController {

    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menus")
    @ApiOperation(value = "获取菜单信息")
    public String getAllMenus(){
        HashMap<String, Object> data = new HashMap<>();
        List<MainMenu> menus = menuDao.getMenus();
        if(menus != null){
            data.put("menus", menus);
            data.put("flag", 200);
        }else{
            data.put("flag", 404);
        }
        return JSON.toJSONString(data);
    }
}
