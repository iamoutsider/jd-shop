package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.JudAreacity;
import java.util.List;

/**
 * (JudAreacity)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 18:23:10
 */
public interface JudAreacityService {

    /**
     * 通过ID查询单条数据
     *
     * @param judAreacityid 主键
     * @return 实例对象
     */
    JudAreacity queryById(Integer judAreacityid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudAreacity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param judAreacity 实例对象
     * @return 实例对象
     */
    JudAreacity insert(JudAreacity judAreacity);

    /**
     * 修改数据
     *
     * @param judAreacity 实例对象
     * @return 实例对象
     */
    JudAreacity update(JudAreacity judAreacity);

    /**
     * 通过主键删除数据
     *
     * @param judAreacityid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer judAreacityid);

}