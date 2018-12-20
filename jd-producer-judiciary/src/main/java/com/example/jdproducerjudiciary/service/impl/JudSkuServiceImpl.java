package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.JudSku;
import com.example.jdproducerjudiciary.dao.JudSkuDao;
import com.example.jdproducerjudiciary.service.JudSkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (JudSku)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 18:23:45
 */
@Service("judSkuService")
public class JudSkuServiceImpl implements JudSkuService {
    @Resource
    private JudSkuDao judSkuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    @Override
    public JudSku queryById(Integer skuId) {
        return this.judSkuDao.queryById(skuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JudSku> queryAllByLimit(int offset, int limit) {
        return this.judSkuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param judSku 实例对象
     * @return 实例对象
     */
    @Override
    public JudSku insert(JudSku judSku) {
        this.judSkuDao.insert(judSku);
        return judSku;
    }

    /**
     * 修改数据
     *
     * @param judSku 实例对象
     * @return 实例对象
     */
    @Override
    public JudSku update(JudSku judSku) {
        this.judSkuDao.update(judSku);
        return this.queryById(judSku.getSkuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer skuId) {
        return this.judSkuDao.deleteById(skuId) > 0;
    }
}