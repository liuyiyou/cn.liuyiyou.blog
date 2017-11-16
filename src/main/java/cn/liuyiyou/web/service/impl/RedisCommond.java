package cn.liuyiyou.web.service.impl;

import cn.liuyiyou.web.service.IRedisCommond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * User: liuyiyou
 * Date: 2017/9/9
 * Time: 下午2:34
 */
@Service
public class RedisCommond implements IRedisCommond {


    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public boolean set(final String key, final String value) {
        return false;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
