package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.JudSku;
import java.util.List;

/**
 * (JudSku)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 18:23:45
 */
public interface JudSkuService {

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    JudSku queryById(Integer skuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudSku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param judSku 实例对象
     * @return 实例对象
     */
    JudSku insert(JudSku judSku);

    /**
     * 修改数据
     *
     * @param judSku 实例对象
     * @return 实例对象
     */
    JudSku update(JudSku judSku);

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer skuId);

}