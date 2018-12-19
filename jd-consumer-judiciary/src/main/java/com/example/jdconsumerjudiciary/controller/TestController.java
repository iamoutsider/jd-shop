package com.example.jdconsumerjudiciary.controller;


import com.example.jdconsumerjudiciary.feign.TestFeign;
import com.example.jdconsumerjudiciary.uitl.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {


    @Resource
    private TestFeign feign;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/asd")
    public String aa(){
        return feign.aa();
    }

    @RequestMapping("/redis")
    public String redis(){
        redisUtil.set("a","555");
        return (String) redisUtil.get("a");
    }
}
