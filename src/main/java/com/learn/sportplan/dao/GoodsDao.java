package com.learn.sportplan.dao;

import com.learn.sportplan.bean.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    // 获取商品数量
    public int getGoodsCount(@Param("goodName") String goodName);
    // 获取商品列表
    public List<Goods> getAllGoods(@Param("goodName") String goodName, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    // 增加商品
    public int addGoods(Goods goods);
    public Goods getGood(int id);
    public int updateGood(Goods good);
    public int deleteGood(int id);
}
