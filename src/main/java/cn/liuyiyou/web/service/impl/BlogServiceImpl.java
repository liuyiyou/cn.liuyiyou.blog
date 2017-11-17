/**
 * <p>
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.web.service.impl;

import cn.liuyiyou.web.mapper.BlogMapper;
import cn.liuyiyou.web.model.Blog;
import cn.liuyiyou.web.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 数据表 <code>t_blog</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BlogServiceImpl implements BlogService {

    /** 日志记录器，t_blog */
    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    /** MyBatis SqlMapper 实例，t_blog */
    @Autowired
    private BlogMapper mapper;

    @Override
    public Blog addBlog(Blog record) {
        mapper.insertSelective(record);
        return record;
    }

    @Override
    public Integer delBlog(Integer id) {
        return mapper.deleteByPrimaryKey((Integer) id);
    }


    @Override
    public Blog updateBlog(Blog record) {
        mapper.updateByPrimaryKeySelective(record);
        return record;
    }


    @Override
    @Transactional(readOnly = true)
    public Blog getByKey(Integer id) {
        return mapper.selectByPrimaryKey((Integer) id);
    }


    @Override
    public PageInfo<Blog> selectByParamsWithPage(Blog params) {
        PageHelper.startPage(params.getPage(), params.getPageSize());
        List<Blog> list = mapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }


    @Override
    public PageInfo<Blog> selectBlogPageWithTags(Blog params) {
        PageHelper.startPage(params.getPage(), params.getPageSize());
        List<Blog> list = mapper.selectBlogPageWithTags(params);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }


}