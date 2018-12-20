package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.Judiciary;
import com.example.jdproducerjudiciary.dao.JudiciaryDao;
import com.example.jdproducerjudiciary.service.JudiciaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Judiciary)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 21:50:35
 */
@Service("judiciaryService")
public class JudiciaryServiceImpl implements JudiciaryService {
    @Resource
    private JudiciaryDao judiciaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param judId 主键
     * @return 实例对象
     */
    @Override
    public Judiciary queryById(Integer judId) {
        return this.judiciaryDao.queryById(judId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Judiciary> queryAllByLimit(int offset, int limit) {
        return this.judiciaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    @Override
    public Judiciary insert(Judiciary judiciary) {
        this.judiciaryDao.insert(judiciary);
        return judiciary;
    }

    /**
     * 修改数据
     *
     * @param judiciary 实例对象
     * @return 实例对象
     */
    @Override
    public Judiciary update(Judiciary judiciary) {
        this.judiciaryDao.update(judiciary);
        return this.queryById(judiciary.getJudId());
    }

    /**
     * 通过主键删除数据
     *
     * @param judId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer judId) {
        return this.judiciaryDao.deleteById(judId) > 0;
    }
}