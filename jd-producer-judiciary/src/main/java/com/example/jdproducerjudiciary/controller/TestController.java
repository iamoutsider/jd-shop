package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.rabbitmqUitl.RabbitConfig;
import com.example.jdproducerjudiciary.uitl.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api(tags = "测试")
@RestController
public class TestController {


    @Resource
    private RedisUtil redisUtil;
    @Resource
    private RabbitTemplate rabbitTemplate;

    @ApiOperation(value = "测试2")
    @RequestMapping("/aa")
    public String aa(){
        redisUtil.set("a","123");
        Object a = redisUtil.get("a");
        System.out.println((String) a);
        return "123";
    }
    @RequestMapping("/mq")
    public void mq(){
        rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_HANWEN,"测试");
    }
}
