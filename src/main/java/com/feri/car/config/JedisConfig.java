package com.feri.car.config;

import com.feri.car.util.JedisUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-11 11:32
 */
@Configuration
public class JedisConfig {
    @Bean
    //ioc 创建对象的方式：1、单例 singleton 2、多例 调用就是创建
    //@Scope(scopeName = "singleton")
    public JedisUtil createJU(){
        return new JedisUtil();
    }
}
