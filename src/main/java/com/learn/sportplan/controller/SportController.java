package com.learn.sportplan.controller;

import com.learn.sportplan.bean.QueryInfo;
import com.learn.sportplan.bean.Result;
import com.learn.sportplan.bean.Sport;
import com.learn.sportplan.service.SportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sport")
@Api(tags = "运动信息")
public class SportController {

    @Autowired
    private SportService sportService;

    @ApiOperation(value = "获取运动信息列表")
    @PostMapping("/getSports")
    public Result getSports(@RequestBody QueryInfo queryInfo){
        return sportService.getSports(queryInfo);
    }

    @ApiOperation(value = "修改运动信息")
    @PostMapping("/updateSport")
    public Result updateSport(@RequestBody Sport sport){
        return sportService.updateSport(sport);
    }

    @ApiOperation(value = "增加运动信息")
    @PostMapping("/insertSport")
    public Result insertSport(@RequestBody Sport sport){
        return sportService.insertSport(sport);
    }

    @ApiOperation(value = "删除运动信息")
    @DeleteMapping("/deleteSport/{id}")
    public Result deleteSport(@PathVariable int id){
        return sportService.deleteSport(id);
    }
}
