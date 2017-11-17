/**
 * <p>
 * Copyright (C) IBALIFE Software Co.,Ltd.
 * </p>
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
package cn.liuyiyou.web.service.impl;

import cn.liuyiyou.web.mapper.MessageMapper;
import cn.liuyiyou.web.model.Message;
import cn.liuyiyou.web.service.MessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 短消息<br>
 * 数据表 <code>t_message</code> 对应的 Java 实体类
 * <p>
 * 创建日期： 2017-11-17
 * </p>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MessageServiceImpl implements MessageService {

    /**
     * 日志记录器，t_message
     */
    private static final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    /**
     * MyBatis SqlMapper 实例，t_message
     */
    @Autowired
    private MessageMapper mapper;

    @Override
    public Message addMessage(Message record) {
        mapper.insertSelective(record);
        return record;
    }

    @Override
    public Integer delMessage(Integer id) {
        return mapper.deleteByPrimaryKey((Integer) id);
    }


    @Override
    public Message updateMessage(Message record) {
        mapper.updateByPrimaryKeySelective(record);
        return record;
    }

    @Override
    @Transactional(readOnly = true)
    public Message getByKey(Integer id) {
        return mapper.selectByPrimaryKey((Integer) id);
    }

    @Override
    public PageInfo<Message> selectByParamsWithPage(Message params) {
        PageHelper.startPage(params.getPage(), params.getPageSize());
        List<Message> list = mapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}