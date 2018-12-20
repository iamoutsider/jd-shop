package com.example.jdproducerjudiciary.dao;

import com.example.jdproducerjudiciary.entity.JudSku;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (JudSku)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 18:23:45
 */
public interface JudSkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    JudSku queryById(Integer skuId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JudSku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param judSku 实例对象
     * @return 对象列表
     */
    List<JudSku> queryAll(JudSku judSku);

    /**
     * 新增数据
     *
     * @param judSku 实例对象
     * @return 影响行数
     */
    int insert(JudSku judSku);

    /**
     * 修改数据
     *
     * @param judSku 实例对象
     * @return 影响行数
     */
    int update(JudSku judSku);

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 影响行数
     */
    int deleteById(Integer skuId);

}