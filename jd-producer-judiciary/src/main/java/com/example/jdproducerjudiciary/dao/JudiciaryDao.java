package com.example.jdproducerjudiciary.dao;

import com.example.jdproducerjudiciary.entity.Judiciary;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Judiciary)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 18:24:01
 */
public interface JudiciaryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param judId 主键
     * @return 实例对象
     */
    Judiciary queryById(Integer judId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Judiciary> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param judiciary 实例对象
     * @return 对象列表
     */
    List<Judiciary> queryAll(Judiciary judiciary);

    /**
     * 新增数据
     *
     * @param judiciary 实例对象
     * @return 影响行数
     */
    int insert(Judiciary judiciary);

    /**
     * 修改数据
     *
     * @param judiciary 实例对象
     * @return 影响行数
     */
    int update(Judiciary judiciary);

    /**
     * 通过主键删除数据
     *
     * @param judId 主键
     * @return 影响行数
     */
    int deleteById(Integer judId);

}