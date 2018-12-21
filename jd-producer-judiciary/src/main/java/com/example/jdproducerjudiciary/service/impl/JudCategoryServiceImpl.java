package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.JudCategory;
import com.example.jdproducerjudiciary.dao.JudCategoryDao;
import com.example.jdproducerjudiciary.service.JudCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (JudCategory)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 22:15:45
 */
@Service
public class JudCategoryServiceImpl implements JudCategoryService {
    @Resource
    private JudCategoryDao judCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param judCategoryid 主键
     * @return 实例对象
     */
    @Override
    public JudCategory queryById(Integer judCategoryid) {
        return this.judCategoryDao.queryById(judCategoryid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JudCategory> queryAllByLimit(int offset, int limit) {
        return this.judCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param judCategory 实例对象
     * @return 实例对象
     */
    @Override
    public JudCategory insert(JudCategory judCategory) {
        this.judCategoryDao.insert(judCategory);
        return judCategory;
    }

    /**
     * 修改数据
     *
     * @param judCategory 实例对象
     * @return 实例对象
     */
    @Override
    public JudCategory update(JudCategory judCategory) {
        this.judCategoryDao.update(judCategory);
        return this.queryById(judCategory.getJudCategoryid());
    }

    /**
     * 通过主键删除数据
     *
     * @param judCategoryid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer judCategoryid) {
        return this.judCategoryDao.deleteById(judCategoryid) > 0;
    }
}