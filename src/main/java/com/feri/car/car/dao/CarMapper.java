package com.feri.car.car.dao;

import com.feri.car.car.entity.Car;
import com.feri.car.dto.CarDetailDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarMapper {
    int insert(Car record);
    List<Car> selectByMid(int mid);
    //查询详情
    CarDetailDto selectById(int id);
}