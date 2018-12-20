package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.JudAreacity;
import com.example.jdproducerjudiciary.dao.JudAreacityDao;
import com.example.jdproducerjudiciary.service.JudAreacityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (JudAreacity)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 18:23:10
 */
@Service("judAreacityService")
public class JudAreacityServiceImpl implements JudAreacityService {
    @Resource
    private JudAreacityDao judAreacityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param judAreacityid 主键
     * @return 实例对象
     */
    @Override
    public JudAreacity queryById(Integer judAreacityid) {
        return this.judAreacityDao.queryById(judAreacityid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JudAreacity> queryAllByLimit(int offset, int limit) {
        return this.judAreacityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param judAreacity 实例对象
     * @return 实例对象
     */
    @Override
    public JudAreacity insert(JudAreacity judAreacity) {
        this.judAreacityDao.insert(judAreacity);
        return judAreacity;
    }

    /**
     * 修改数据
     *
     * @param judAreacity 实例对象
     * @return 实例对象
     */
    @Override
    public JudAreacity update(JudAreacity judAreacity) {
        this.judAreacityDao.update(judAreacity);
        return this.queryById(judAreacity.getJudAreacityid());
    }

    /**
     * 通过主键删除数据
     *
     * @param judAreacityid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer judAreacityid) {
        return this.judAreacityDao.deleteById(judAreacityid) > 0;
    }
}