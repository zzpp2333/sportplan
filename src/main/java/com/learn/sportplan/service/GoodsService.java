package com.learn.sportplan.service;

import com.learn.sportplan.bean.Goods;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;

public interface GoodsService {
    public Result getGoodsList(QueryInfo queryInfo); // 根据queryInfo进行模糊查询 获得查询结果
    public Result addGoods(Goods goods); // 增加商品
    public Result getGoodById(int id);  // 根据id获取商品信息
    public Result updateGood(Goods good); // 更新商品信息
    public Result deleteGood(int id); // 根据id删除商品
}
