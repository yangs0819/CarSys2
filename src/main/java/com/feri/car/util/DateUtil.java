package com.feri.car.util;


import java.time.Year;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {
    //获取指定年的今天
    public static Date addYear(int y){
        //日列类完成实列
        Calendar calendar = Calendar.getInstance();
        //计算日期
         calendar.add(Calendar.YEAR,y);
         return calendar.getTime();
    }
}
