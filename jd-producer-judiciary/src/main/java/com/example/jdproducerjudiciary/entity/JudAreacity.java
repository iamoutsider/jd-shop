package com.example.jdproducerjudiciary.entity;

import java.io.Serializable;

/**
 * (JudAreacity)实体类
 *
 * @author makejava
 * @since 2018-12-20 18:23:10
 */
public class JudAreacity implements Serializable {
    private static final long serialVersionUID = -36433659144105584L;
    //拍品所在地ID 省市
    private Integer judAreacityid;
    //省市 山西
    private String judAreacityname;


    public Integer getJudAreacityid() {
        return judAreacityid;
    }

    public void setJudAreacityid(Integer judAreacityid) {
        this.judAreacityid = judAreacityid;
    }

    public String getJudAreacityname() {
        return judAreacityname;
    }

    public void setJudAreacityname(String judAreacityname) {
        this.judAreacityname = judAreacityname;
    }

}