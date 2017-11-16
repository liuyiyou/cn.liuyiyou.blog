package cn.liuyiyou.web.service;

/**
 * User: liuyiyou
 * Date: 2017/9/9
 * Time: 下午2:34
 */
public interface IRedisCommond {

    boolean set(String key, String value);

    String get(String key);
}
