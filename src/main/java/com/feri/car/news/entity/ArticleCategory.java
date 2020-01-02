package com.feri.car.news.entity;

import lombok.Data;

@Data
public class ArticleCategory {
    private Integer id;

    private String name;

    private Byte isDeleted;

    private Integer sortNum;

    private Integer createTime;

    private Integer lastUpdateTime;


}