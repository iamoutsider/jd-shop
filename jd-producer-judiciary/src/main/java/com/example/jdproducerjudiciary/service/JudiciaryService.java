package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.Judiciary;
import java.util.List;

/**
 * (Judiciary)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 18:24:01
 */
public interface JudiciaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param judId 主键
     * @return 实例对象
     */
    Judiciary queryById(Integer judId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Judiciary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    Judiciary insert(Judiciary judiciary);

    /**
     * 修改数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    Judiciary update(Judiciary judiciary);

    /**
     * 通过主键删除数据
     *
     * @param judId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer judId);

}