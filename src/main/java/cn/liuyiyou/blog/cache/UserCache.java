//package cn.liuyiyou.blog.cache;
//
//import cn.liuyiyou.blog.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
///**
// * @author: liuyiyou
// * @date: 2017/11/13
// * Time: 下午3:03
// */
//@Repository
//public class UserCache {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    private static String PRE_FIX = User.class.getSimpleName();
//
//    public void setRedisByKey(String key, User user){
//        String primaryKey  = PRE_FIX+":"+ key;
//        redisTemplate.opsForValue().set(primaryKey,user);
//    }
//
//    public User getRedisByKey(String key){
//        String primaryKey  = PRE_FIX+":"+ key;
//        return (User) redisTemplate.opsForValue().get(primaryKey);
//    }
//
//}
