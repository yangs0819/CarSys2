package com.feri.car.dto;


import lombok.Data;

import java.util.Date;
@Data
public class ActivityDto {
  private int id;
  private String name;
  private String aurl;
  private Date startTime;
  private Date endTime;
}
