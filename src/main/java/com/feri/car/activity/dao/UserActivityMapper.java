package com.feri.car.activity.dao;


import com.feri.car.activity.entity.UserActivity;
import com.feri.car.dto.UserActivityDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserActivityMapper {

    int insert(UserActivity record);
    List<UserActivityDto> selectById(int uid);

}