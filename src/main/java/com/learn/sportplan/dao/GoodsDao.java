package com.learn.sportplan.dao;

import com.github.pagehelper.Page;
import com.learn.sportplan.bean.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    // 获取商品数量
    public int getGoodsCount(@Param("goodName") String goodName);
    // 获取商品列表
    public Page<Goods> getAllGoods(@Param("goodName") String goodName);
    // 增加商品
    public int addGoods(Goods goods);
    public Goods getGoodById(int id);
    public int updateGood(Goods good);
    public int deleteGood(int id);
}
