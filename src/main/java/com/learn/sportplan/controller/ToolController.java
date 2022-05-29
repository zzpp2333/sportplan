package com.learn.sportplan.controller;

import com.learn.sportplan.bean.Result;
import com.learn.sportplan.util.QiniuUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Api(tags = "工具")
@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    private QiniuUtil qiniuUtil;

    @ApiOperation("将文件上传到七牛云")
    @PostMapping("/uploadQiniu")
    public Result uploadQiniu(@RequestBody MultipartFile file) throws IOException{
        String uuid = UUID.randomUUID().toString().substring(0, 7);
        String filename = file.getOriginalFilename();
        int index = filename.lastIndexOf(".");
        String suffix = filename.substring(index);
//        String url = qiniuUtil.uploadQiniu(file.getBytes(), file.getOriginalFilename());
        String url = qiniuUtil.uploadQiniu(file.getBytes(), uuid+suffix);
        return Result.success("文件上传成功", url);
    }
}
