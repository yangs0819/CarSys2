package com.feri.car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //启用swagger的扫描
@MapperScan("com.feri.car.user.dao,com.feri.car.oss.dao,com.feri.car.news.dao")
public class CarsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsysApplication.class, args);
    }

}
