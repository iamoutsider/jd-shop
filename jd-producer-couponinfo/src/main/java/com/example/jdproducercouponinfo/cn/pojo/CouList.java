package com.example.jdproducercouponinfo.cn.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CouList {

  private Integer couId;
  private String couName;
  private String couCid;
  private Integer couOwneruid;
  private String couStarttime;
  private String couPasstime;
  private Integer couType;
  private Integer couQuota;
  private Integer couSale;
  private Integer couDiscount;
  private Integer couAmount;
  private Integer couStauts;

}
