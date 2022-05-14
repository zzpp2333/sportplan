package com.learn.sportplan.controller;

import com.learn.sportplan.bean.Goods;
import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    @Qualifier("goodsServiceImpl")
    private GoodsService goodsService;

    @RequestMapping("/allGoods")
    public Result getGoodsList(QueryInfo queryInfo){
        return goodsService.getGoodsList(queryInfo);
//        HashMap<String, Object> res = new HashMap<>();
//        res.put("numbers", numbers);
//        res.put("data", goodsList);
//        System.out.println("总条数: "+numbers);
//        return JSON.toJSONString(res);
    }

    @RequestMapping("/addGoods")
    public Result addGoods(@RequestBody Goods goods){
        return goodsService.addGoods(goods);
    }

    @RequestMapping("/getGood")
    public Result getGoodById(int id){
//        通过id查询Goods
        return goodsService.getGoodById(id);
    }

    @RequestMapping("/updateGood")
    public Result updateGood(@RequestBody Goods good){
        return goodsService.updateGood(good);
    }

    @RequestMapping("/deleteGood")
    public Result deleteGood(int id){
        return goodsService.deleteGood(id);
    }
}
