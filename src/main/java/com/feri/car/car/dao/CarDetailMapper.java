package com.feri.car.car.dao;

import com.feri.car.car.entity.CarDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailMapper {
    int insert(CarDetail record);

}