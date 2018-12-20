package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.JudAreacity;
import com.example.jdproducerjudiciary.service.JudAreacityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JudAreacity)表控制层
 *
 * @author makejava
 * @since 2018-12-20 18:23:10
 */
@RestController
@RequestMapping("judAreacity")
public class JudAreacityController {
    /**
     * 服务对象
     */
    @Resource
    private JudAreacityService judAreacityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JudAreacity selectOne(Integer id) {
        return this.judAreacityService.queryById(id);
    }

}