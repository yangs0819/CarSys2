package com.feri.car.activity.dao;


import com.feri.car.activity.entity.Activity;
import com.feri.car.dto.ActivityDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ActivityMapper {

    int insert(Activity record);
    //查询轮播图片信息
    List<ActivityDto> selectConver();
    //查询未失效的新车特惠
    List<ActivityDto> selectNew();
    //查询所有活动
    List<ActivityDto> selectAll();

}