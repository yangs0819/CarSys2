package com.feri.car.car.dao;

import com.feri.car.car.entity.CarMedia;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMediaMapper {
    int insert(CarMedia record);
}