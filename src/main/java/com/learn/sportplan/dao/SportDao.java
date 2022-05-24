package com.learn.sportplan.dao;

import com.github.pagehelper.Page;
import com.learn.sportplan.bean.Sport;

public interface SportDao {
    public Page<Sport> getSports(String query);
    public Sport getSportById(int id);
    public Sport getSportByName(int id);
    public int insertSport(Sport sport);
    public int updateSport(Sport sport);
    public int deleteSport(Integer id);
}
