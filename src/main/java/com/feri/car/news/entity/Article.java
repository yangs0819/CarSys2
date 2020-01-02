package com.feri.car.news.entity;

import lombok.Data;

@Data
public class Article {
    private Long id;

    private String title;

    private Integer categoryId;

    private String source;

    private String author;

    private String summary;

    private String coverPic;

    private String thumbPic;

    private String tags;

    private String previewUrl;

    private String qrcodeUrl;

    private Integer pvCount;

    private Integer uvCount;

    private Integer commentCount;

    private Integer likeCount;

    private Integer favCount;

    private Integer shareCount;

    private Byte channelTop;

    private Byte homeTop;

    private Integer createUid;

    private String createUname;

    private Integer createTime;

    private Integer submitUid;

    private Integer submitTime;

    private Integer state;

    private Integer stateOrder;

    private Byte publishState;

    private Byte allowUp;

    private Byte allowFav;

    private String content;


}