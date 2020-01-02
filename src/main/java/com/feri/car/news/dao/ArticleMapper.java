package com.feri.car.news.dao;

import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleMapper {
    int insert(Article record);
    Article selectById(int id);
    List<Article> selectAll(ArticleQueryDto queryDto);
    int update(int id);
}