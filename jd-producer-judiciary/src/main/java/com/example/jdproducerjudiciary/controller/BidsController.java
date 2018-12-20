package com.example.jdproducerjudiciary.controller;

import com.example.jdproducerjudiciary.entity.Bids;
import com.example.jdproducerjudiciary.service.BidsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Bids)表控制层
 *
 * @author makejava
 * @since 2018-12-20 18:21:49
 */
@RestController
@RequestMapping("bids")
public class BidsController {
    /**
     * 服务对象
     */
    @Resource
    private BidsService bidsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Bids selectOne(Integer id) {
        return this.bidsService.queryById(id);
    }

}