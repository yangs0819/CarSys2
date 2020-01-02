package com.feri.car.news.entity;

import lombok.Data;

import java.util.Date;
@Data
public class ArticleAction {
    private Long id;

    private Integer aid;

    private Integer ouid;

    private String oname;

    private Date ctime;

    private String content;

    private Byte operateType;


}