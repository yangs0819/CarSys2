package com.feri.car.car.dao;

import com.feri.car.car.entity.CarModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarModelMapper {
    int insert(CarModel record);
    List<CarModel> selectByBid(int bid);
}