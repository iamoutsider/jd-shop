package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.Bids;
import java.util.List;

/**
 * (Bids)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 21:04:21
 */
public interface BidsService {

    /**
     * 通过ID查询单条数据
     *
     * @param bidsId 主键
     * @return 实例对象
     */
    Bids queryById(Integer bidsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Bids> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bids 实例对象
     * @return 实例对象
     */
    Bids insert(Bids bids);

    /**
     * 修改数据
     *
     * @param bids 实例对象
     * @return 实例对象
     */
    Bids update(Bids bids);

    /**
     * 通过主键删除数据
     *
     * @param bidsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bidsId);

}