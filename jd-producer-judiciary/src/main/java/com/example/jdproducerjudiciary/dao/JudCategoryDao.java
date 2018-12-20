package com.example.jdproducerjudiciary.dao;

import com.example.jdproducerjudiciary.entity.JudCategory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (JudCategory)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 21:05:36
 */
public interface JudCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param judCategoryid 主键
     * @return 实例对象
     */
    JudCategory queryById(Integer judCategoryid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param judCategory 实例对象
     * @return 对象列表
     */
    List<JudCategory> queryAll(JudCategory judCategory);

    /**
     * 新增数据
     *
     * @param judCategory 实例对象
     * @return 影响行数
     */
    int insert(JudCategory judCategory);

    /**
     * 修改数据
     *
     * @param judCategory 实例对象
     * @return 影响行数
     */
    int update(JudCategory judCategory);

    /**
     * 通过主键删除数据
     *
     * @param judCategoryid 主键
     * @return 影响行数
     */
    int deleteById(Integer judCategoryid);

}