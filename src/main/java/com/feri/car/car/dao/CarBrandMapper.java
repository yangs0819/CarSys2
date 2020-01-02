package com.feri.car.car.dao;

import com.feri.car.car.entity.CarBrand;
import com.feri.car.dto.CarBrandDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarBrandMapper {
    int insert(CarBrand record);
    //查询所有品牌 安装首字母排序
    List<CarBrandDto> selectAll();



}