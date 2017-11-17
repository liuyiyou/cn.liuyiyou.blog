/**
 * <p> 
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.web.service.impl;

import cn.liuyiyou.web.mapper.TagMapper;
import cn.liuyiyou.web.model.Tag;
import cn.liuyiyou.web.service.TagService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 数据表 <code>t_tag</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TagServiceImpl implements TagService {

    /** 日志记录器，t_tag */
    private static final Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);

    /** MyBatis SqlMapper 实例，t_tag */
    @Autowired
    private TagMapper mapper;

    @Override
    public Tag addTag(Tag record) {
        mapper.insertSelective(record);
        return record;
    }

    @Override
    public Integer delTag(Integer id) {
        return mapper.deleteByPrimaryKey((Integer) id);
    }


    @Override
    public Tag updateTag(Tag record) {
        mapper.updateByPrimaryKeySelective(record);
        return record;
    }

    @Override
    @Transactional(readOnly = true)
    public Tag getByKey(Integer id) {
        return mapper.selectByPrimaryKey((Integer) id);
    }


    @Override
    public PageInfo<Tag> selectByParamsWithPage(Tag params) {
        PageHelper.startPage(params.getPage(), params.getPageSize());
        List<Tag> list = mapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}