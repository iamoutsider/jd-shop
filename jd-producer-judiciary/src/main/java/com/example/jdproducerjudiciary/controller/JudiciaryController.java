package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.Judiciary;
import com.example.jdproducerjudiciary.service.JudiciaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Judiciary)表控制层
 *
 * @author makejava
 * @since 2018-12-20 21:50:35
 */
@RestController
@RequestMapping("judiciary")
public class JudiciaryController {
    /**
     * 服务对象
     */
    @Resource
    private JudiciaryService judiciaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Judiciary selectOne(Integer id) {
        return this.judiciaryService.queryById(id);
    }

}