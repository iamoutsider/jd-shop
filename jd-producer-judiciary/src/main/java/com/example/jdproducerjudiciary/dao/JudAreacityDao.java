package com.example.jdproducerjudiciary.dao;

import com.example.jdproducerjudiciary.entity.JudAreacity;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (JudAreacity)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 18:23:10
 */
public interface JudAreacityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param judAreacityid 主键
     * @return 实例对象
     */
    JudAreacity queryById(Integer judAreacityid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudAreacity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param judAreacity 实例对象
     * @return 对象列表
     */
    List<JudAreacity> queryAll(JudAreacity judAreacity);

    /**
     * 新增数据
     *
     * @param judAreacity 实例对象
     * @return 影响行数
     */
    int insert(JudAreacity judAreacity);

    /**
     * 修改数据
     *
     * @param judAreacity 实例对象
     * @return 影响行数
     */
    int update(JudAreacity judAreacity);

    /**
     * 通过主键删除数据
     *
     * @param judAreacityid 主键
     * @return 影响行数
     */
    int deleteById(Integer judAreacityid);

}