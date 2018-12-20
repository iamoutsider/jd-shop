package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.JudCategory;
import com.example.jdproducerjudiciary.service.JudCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JudCategory)表控制层
 *
 * @author makejava
 * @since 2018-12-20 18:23:30
 */
@RestController
@RequestMapping("judCategory")
public class JudCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private JudCategoryService judCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JudCategory selectOne(Integer id) {
        return this.judCategoryService.queryById(id);
    }

}