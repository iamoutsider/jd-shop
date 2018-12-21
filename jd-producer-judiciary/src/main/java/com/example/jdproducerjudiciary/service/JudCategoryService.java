package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.JudCategory;
import java.util.List;

/**
 * (JudCategory)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 22:15:45
 */
public interface JudCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param judCategoryid 主键
     * @return 实例对象
     */
    JudCategory queryById(Integer judCategoryid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param judCategory 实例对象
     * @return 实例对象
     */
    JudCategory insert(JudCategory judCategory);

    /**
     * 修改数据
     *
     * @param judCategory 实例对象
     * @return 实例对象
     */
    JudCategory update(JudCategory judCategory);

    /**
     * 通过主键删除数据
     *
     * @param judCategoryid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer judCategoryid);

}