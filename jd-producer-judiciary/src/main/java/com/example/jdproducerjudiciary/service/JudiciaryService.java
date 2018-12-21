package com.example.jdproducerjudiciary.service;

import com.example.jdproducerjudiciary.entity.Judiciary;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;
import java.util.List;

/**
 * (Judiciary)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 21:50:35
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
     * 查询多条数据 导到solr
     *
     * @return 对象列表
     */
    void queryAll() throws IOException, SolrServerException;

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