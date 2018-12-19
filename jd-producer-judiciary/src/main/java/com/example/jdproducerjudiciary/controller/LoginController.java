package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.Login;
import com.example.jdproducerjudiciary.service.LoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Login)表控制层
 *
 * @author makejava
 * @since 2018-12-18 18:04:13
 */
@RestController
public class LoginController {
    /**
     * 服务对象
     */
    @Resource
    private LoginService loginService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Login selectOne(Integer id) {
        return this.loginService.queryById(id);
    }

}