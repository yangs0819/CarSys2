package com.feri.car.news.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.dao.ArticleMapper;
import com.feri.car.news.entity.Article;
import com.feri.car.news.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper mapper;
    @Override
    public R save(Article article) {
        if (mapper.insert(article) > 1){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryById(int id) {
        return R.Ok(mapper.selectById(id));
    }

    @Override
    public R queryPage(ArticleQueryDto queryDto) {
        if (queryDto.getTitle() != null){
            queryDto.setTitle("%"+queryDto.getTitle()+"%");
        }
        //设置分页 当前的页码 每页显示的数量
        PageHelper.startPage(queryDto.getPage(),queryDto.getSize());
        //查询数据
        List<Article> list = mapper.selectAll(queryDto);
        PageInfo<Article> page = new PageInfo<>(list);
        return R.Ok(page);
    }

    @Override
    public R del(int id) {
        if (mapper.update(id) > 0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }
}
