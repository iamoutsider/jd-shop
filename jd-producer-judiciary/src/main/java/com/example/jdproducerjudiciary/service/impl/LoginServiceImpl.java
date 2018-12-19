package com.example.jdproducerjudiciary.service.impl;

import com.example.jdproducerjudiciary.entity.Login;
import com.example.jdproducerjudiciary.dao.LoginDao;
import com.example.jdproducerjudiciary.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Login)表服务实现类
 *
 * @author makejava
 * @since 2018-12-18 18:04:13
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Login queryById(Integer id) {


        return this.loginDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Login> queryAllByLimit(int offset, int limit) {
        return this.loginDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param login 实例对象
     * @return 实例对象
     */
    @Override
    public Login insert(Login login) {
        this.loginDao.insert(login);
        return login;
    }

    /**
     * 修改数据
     *
     * @param login 实例对象
     * @return 实例对象
     */
    @Override
    public Login update(Login login) {
        this.loginDao.update(login);
        return this.queryById(login.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.loginDao.deleteById(id) > 0;
    }
}