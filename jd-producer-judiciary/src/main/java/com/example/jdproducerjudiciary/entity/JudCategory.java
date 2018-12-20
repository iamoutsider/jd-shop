package com.example.jdproducerjudiciary.entity;

import java.io.Serializable;

/**
 * (JudCategory)实体类
 *
 * @author makejava
 * @since 2018-12-20 21:05:36
 */
public class JudCategory implements Serializable {
    private static final long serialVersionUID = -50295680296189518L;
    //司法分类ID
    private Integer judCategoryid;
    //类别
    private String judType;


    public Integer getJudCategoryid() {
        return judCategoryid;
    }

    public void setJudCategoryid(Integer judCategoryid) {
        this.judCategoryid = judCategoryid;
    }

    public String getJudType() {
        return judType;
    }

    public void setJudType(String judType) {
        this.judType = judType;
    }

}