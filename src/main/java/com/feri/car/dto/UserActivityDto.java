package com.feri.car.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserActivityDto {
  private int id;
  private int aid;
  private String name;//活动名称
  private String aurl;//活动图片
  private Date startTime;
  private Date endTime;
}
