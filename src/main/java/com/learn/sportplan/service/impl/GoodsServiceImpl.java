package com.learn.sportplan.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.learn.sportplan.bean.Goods;
import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.dao.GoodsDao;
import com.learn.sportplan.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsServiceImpl")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Result getGoodsList(QueryInfo queryInfo) {
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<Goods> page = goodsDao.getAllGoods(queryInfo.getQuery());
        long total = page.getTotal();
        List<Goods> result = page.getResult();
        return new PageResult(total, result);
    }

    @Override
    public Result addGoods(Goods goods) {
        System.out.println(goods);
        int res = goodsDao.addGoods(goods);
        return res > 0 ? Result.success("增加商品成功") : Result.fail("增加商品失败");
    }

    @Override
    public Result getGoodById(int id) {
        Goods res = goodsDao.getGoodById(id);
//        System.out.println(res);
        return Result.success("获取商品信息", res);
    }

    @Override
    public Result updateGood(Goods good) {
        System.out.println(good);
        int res = goodsDao.updateGood(good);
//        System.out.println(res);
        return res > 0 ? Result.success("编辑商品信息成功") : Result.fail("编辑商品信息失败");
    }

    @Override
    public Result deleteGood(int id) {
        int res = goodsDao.deleteGood(id);
        return res > 0 ? Result.success("删除商品成功") : Result.fail("删除商品失败");
    }
}
