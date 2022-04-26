package com.learn.sportplan.controller;

import com.alibaba.fastjson.JSON;
import com.learn.sportplan.bean.Goods;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsDao goodsDao;

    @RequestMapping("/allGoods")
    public String getGoodsList(QueryInfo queryInfo){
        int numbers = goodsDao.getGoodsCount("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageStart() - 1) * queryInfo.getPageSize();
        List<Goods> goodsList = goodsDao.getAllGoods("%"+queryInfo.getQuery()+"%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers", numbers);
        res.put("data", goodsList);
        System.out.println("总条数: "+numbers);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/addGoods")
    public String addGoods(@RequestBody Goods goods){
        System.out.println(goods);
        int i = goodsDao.addGoods(goods);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/getGood")
    public String getGood(int id){
//        通过id查询Goods
        Goods res = goodsDao.getGood(id);
        System.out.println(res);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/updateGood")
    public String updateGood(@RequestBody Goods good){
        System.out.println(good);
        int res = goodsDao.updateGood(good);
        System.out.println(res);
        return res > 0 ? "success" : "error";
    }

    @RequestMapping("/deleteGood")
    public String deleteGood(int id){
        int res = goodsDao.deleteGood(id);
        return res > 0 ? "success" : "error";
    }
}
