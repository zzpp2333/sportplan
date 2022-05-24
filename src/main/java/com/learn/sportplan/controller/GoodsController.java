package com.learn.sportplan.controller;

import com.learn.sportplan.bean.Goods;
import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
@Api(tags = "商品信息")
public class GoodsController {

    @Autowired
    @Qualifier("goodsServiceImpl")
    private GoodsService goodsService;

    @RequestMapping("/allGoods")
    @ApiOperation(value = "获取商品信息列表")
    public Result getGoodsList(QueryInfo queryInfo){
        return goodsService.getGoodsList(queryInfo);
//        HashMap<String, Object> res = new HashMap<>();
//        res.put("numbers", numbers);
//        res.put("data", goodsList);
//        System.out.println("总条数: "+numbers);
//        return JSON.toJSONString(res);
    }

    @RequestMapping("/addGoods")
    @ApiOperation(value = "添加商品")
    public Result addGoods(@RequestBody Goods goods){
        return goodsService.addGoods(goods);
    }

    @RequestMapping("/getGood")
    @ApiOperation(value = "通过id获取商品信息")
    public Result getGoodById(int id){
//        通过id查询Goods
        return goodsService.getGoodById(id);
    }

    @RequestMapping("/updateGood")
    @ApiOperation(value = "修改商品信息")
    public Result updateGood(@RequestBody Goods good){
        return goodsService.updateGood(good);
    }

    @RequestMapping("/deleteGood")
    @ApiOperation(value = "删除商品")
    public Result deleteGood(int id){
        return goodsService.deleteGood(id);
    }
}
