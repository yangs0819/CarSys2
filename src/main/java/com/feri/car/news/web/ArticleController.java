package com.feri.car.news.web;

import com.feri.car.common.vo.R;
import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.entity.Article;
import com.feri.car.news.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Api(value = "新闻模块",tags = "新闻模块")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    //查询列表
    @ApiOperation(value = "实现资讯列表查询",notes = "实现咨询列表查询，支持搜索")
    @GetMapping("/api/news/newspage.do")
    public R page(ArticleQueryDto queryDto){
        return articleService.queryPage(queryDto);
    }
    //查询详情
    @ApiOperation(value = "实现资讯详情",notes = "实现资讯详情")
    @GetMapping("/api/news/queryById.do")
    public R detail(int id){
        return articleService.queryById(id);
    }

    //新增
    @ApiOperation(value = "实现资讯新增",notes = "实现资讯新增")
    @PostMapping("/api/news/save.do")
    public R save(@RequestBody Article article){
        return articleService.save(article);
    }


    //删除
    @ApiOperation(value = "实现资讯的删除",notes = "实现资讯的删除")
    @DeleteMapping("/api/news/del.do")
    public R del(int id){
        return articleService.del(id);
    }
}
