/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
package cn.liuyiyou.web.service.impl;

import cn.liuyiyou.web.mapper.UserMapper;
import cn.liuyiyou.web.model.User;
import cn.liuyiyou.web.model.UserExample;
import cn.liuyiyou.web.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 数据表 <code>user</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-14
 * </p>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    /** 日志记录器，user */
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /** MyBatis SqlMapper 实例，user */
    @Autowired
    private UserMapper mapper;

    @Override
    public User addUser(User record) {
        mapper.insertSelective(record);
        return record;
    }

    @Override
    public Integer delUser(Integer id) {
        return mapper.deleteByPrimaryKey((Integer) id);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public User updateUser(User record) {
        mapper.updateByPrimaryKeySelective(record);
        return record;
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    @Transactional(readOnly = true)
    public User getByKey(Integer id) {
        return mapper.selectByPrimaryKey((Integer) id);
    }

    @Override
    @Transactional(readOnly = true)
    public int countByExample(UserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> selectByExample(UserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public PageInfo<User> selectByExampleWithPage(UserExample example) {
        PageHelper.startPage(example.getPage(), example.getPageSize());
        List<User> list = mapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageInfo<User> selectByParamsWithPage(User params) {
        PageHelper.startPage(params.getPage(), params.getPageSize());
        List<User> list = mapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}