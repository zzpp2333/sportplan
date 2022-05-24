package com.learn.sportplan.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.learn.sportplan.bean.PageResult;
import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.Sport;
import com.learn.sportplan.dao.SportDao;
import com.learn.sportplan.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportServiceImpl implements SportService {

    @Autowired
    private SportDao sportDao;

    @Override
    public Result getSports(QueryInfo queryInfo) {
        PageHelper.startPage(queryInfo.getPageStart(), queryInfo.getPageSize());
        Page<Sport> pages = sportDao.getSports(queryInfo.getQuery());
        long total = pages.getTotal();
        List<Sport> result = pages.getResult();
        return new PageResult(total, result);
    }

    @Override
    public Result insertSport(Sport sport) {
        sportDao.insertSport(sport);
        return Result.success("添加运动信息成功");
    }

    @Override
    public Result updateSport(Sport sport) {
        sportDao.updateSport(sport);
        return Result.success("修改运动信息成功");
    }

    @Override
    public Result deleteSport(int id) {
        sportDao.deleteSport(id);
        return Result.success("删除运动信息成功");
    }
}
