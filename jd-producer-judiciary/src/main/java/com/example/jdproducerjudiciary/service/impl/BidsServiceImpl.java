package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.Bids;
import com.example.jdproducerjudiciary.dao.BidsDao;
import com.example.jdproducerjudiciary.service.BidsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Bids)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 18:21:49
 */
@Service("bidsService")
public class BidsServiceImpl implements BidsService {
    @Resource
    private BidsDao bidsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bidsId 主键
     * @return 实例对象
     */
    @Override
    public Bids queryById(Integer bidsId) {
        return this.bidsDao.queryById(bidsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Bids> queryAllByLimit(int offset, int limit) {
        return this.bidsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bids 实例对象
     * @return 实例对象
     */
    @Override
    public Bids insert(Bids bids) {
        this.bidsDao.insert(bids);
        return bids;
    }

    /**
     * 修改数据
     *
     * @param bids 实例对象
     * @return 实例对象
     */
    @Override
    public Bids update(Bids bids) {
        this.bidsDao.update(bids);
        return this.queryById(bids.getBidsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bidsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bidsId) {
        return this.bidsDao.deleteById(bidsId) > 0;
    }
}