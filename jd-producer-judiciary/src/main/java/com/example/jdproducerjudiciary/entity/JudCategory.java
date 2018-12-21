package com.example.jdproducerjudiciary.entity;

import java.io.Serializable;

/**
 * (JudCategory)实体类
 *
 * @author makejava
 * @since 2018-12-20 22:15:45
 */
public class JudCategory implements Serializable {
    private static final long serialVersionUID = -59393505292932893L;
    //司法分类ID
    private Integer judCategoryid;
    //司法分类名字
    private String judCategoryname;


    public Integer getJudCategoryid() {
        return judCategoryid;
    }

    public void setJudCategoryid(Integer judCategoryid) {
        this.judCategoryid = judCategoryid;
    }

    public String getJudCategoryname() {
        return judCategoryname;
    }

    public void setJudCategoryname(String judCategoryname) {
        this.judCategoryname = judCategoryname;
    }

}