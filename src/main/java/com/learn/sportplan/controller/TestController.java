package com.learn.sportplan.controller;

import com.learn.sportplan.bean.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //返回字符串
@Api(tags = "测试接口")
public class TestController {

    @ApiOperation(value = "测试")
    @PreAuthorize("hasAnyRole('SUPERADMIN')")
    @RequestMapping("/test")
    public Result test(){
        return Result.success("信息返回成功", "您好");
    }
}
