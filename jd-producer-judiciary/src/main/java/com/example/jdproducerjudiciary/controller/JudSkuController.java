package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.JudSku;
import com.example.jdproducerjudiciary.service.JudSkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JudSku)表控制层
 *
 * @author makejava
 * @since 2018-12-20 18:23:45
 */
@RestController
@RequestMapping("judSku")
public class JudSkuController {
    /**
     * 服务对象
     */
    @Resource
    private JudSkuService judSkuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JudSku selectOne(Integer id) {
        return this.judSkuService.queryById(id);
    }

}