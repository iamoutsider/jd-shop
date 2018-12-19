package com.example.jdproducerjudiciary.entity;

import java.io.Serializable;

/**
 * (Login)实体类
 *
 * @author makejava
 * @since 2018-12-18 18:04:11
 */
public class Login implements Serializable {
    private static final long serialVersionUID = 331042406833241979L;
    //id
    private Integer id;
    //用户名
    private String name;
    //密码
    private String pwd;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}