//package cn.liuyiyou.test.redis;
//
//import cn.liuyiyou.AbstractTest;
//import cn.liuyiyou.blog.cache.UserCache;
//import cn.liuyiyou.blog.entity.User;
//import cn.liuyiyou.blog.service.UserService;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//
///**
// * User: liuyiyou
// * Date: 2017/9/9
// * Time: 下午2:28
// */
//public class RedisTest extends AbstractTest {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//
//    @Autowired
//    private UserCache userCache;
//
//    @Test
//    public void testSet() {
//        User user = new User();
//        user.setUid(999999);
//        user.setAccount("lyy");
//        userCache.setRedisByKey("999999", user);
//    }
//
//
//    @Test
//    public void testGet() {
//        User user = userCache.getRedisByKey("999999");
//        System.out.println(user.getAccount());
//    }
//}
