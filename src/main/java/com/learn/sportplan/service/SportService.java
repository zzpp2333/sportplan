package com.learn.sportplan.service;

import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.Sport;

public interface SportService {
    public Result getSports(QueryInfo queryInfo);
    public Result insertSport(Sport sport);
    public Result updateSport(Sport sport);
    public Result deleteSport(int id);
}
