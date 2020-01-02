package com.feri.car.api;

import com.feri.car.common.vo.R;
import com.feri.car.oss.service.OssUrlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@Api(value = "资源管理",tags = "资源管理")
@RestController
public class OssController {
    @Autowired
    private OssUrlService ossUrlService;

    @ApiOperation(value = "实现资源的上传",notes = "实现资源的上传，返回访问路径")
    @PostMapping("/api/oss/upload.do")
    public R uplode(MultipartFile file){
      return ossUrlService.upload(file);
    }
    @ApiOperation(value = "查询数据库记录的上传信息",notes = "查询数据库记录的上传信息")
    @GetMapping("/api/oss/queryAll.do")
    public R loadAll(){
        return ossUrlService.queryAll();
    }

    @ApiOperation(value = "查询oss云库的所有信息",notes = "查询oss云库的所有信息")
    @GetMapping("/api/oss/queryOssAll.do")
    public R ossAll(){
        return ossUrlService.queryOssAll();
    }


    @ApiOperation(value = "删除数据",notes = "删除数据")
    @GetMapping("/api/oss/del.do")
    public R del(String objname){
        return ossUrlService.delete(objname);
    }
}
