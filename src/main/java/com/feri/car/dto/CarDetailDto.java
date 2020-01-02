package com.feri.car.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 14:49
 */
@Data
public class CarDetailDto {
    private int id;
    private Float cc;//油耗
    private String gear;//变速箱
    private String oil;//油耗
    private Float speed;//加速
    private String name;//名称
    private String model;//款型名称
    private String brand;//品牌
    private BigDecimal price;//价格
    private String imgurl;//主图

}