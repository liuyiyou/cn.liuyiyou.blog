//package cn.liuyiyou.test.mybatis;
//
//import cn.liuyiyou.AbstractTest;
//import cn.liuyiyou.blog.mapper.UserMapper;
//import cn.liuyiyou.blog.entity.User;
//import cn.liuyiyou.blog.entity.UserExample;
//import cn.liuyiyou.blog.service.UserService;
//import com.github.pagehelper.PageInfo;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class ArticleRedisTest extends AbstractTest {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void get() {
//        userMapper.selectByPrimaryKey(1);
//    }
//
//    @Autowired
//    private UserService userService;
//
//
//    @Test
//    public void getUserByIdTest() {
//        userService.getByKey(1);
//    }
//
//    @Test
//    public void transactionTest() {
//    }
//
//    @Test
//    public void page1() {
//        User user = new User();
//        user.setPage(2);
//        user.setPageSize(10);
//        user.setLastChannel((byte) 5);
//        PageInfo<User> userPageInfo = userService.selectByParamsWithPage(user);
//        System.out.println(userPageInfo);
//    }
//
//    @Test
//    public void page2() {
//        UserExample example = new UserExample();
//        UserExample.Criteria criteria = example.createCriteria();
//        example.setPage(2);
//        example.setPageSize(10);
//        criteria.andLastChannelEqualTo((byte)5);
//        PageInfo<User> userPageInfo = userService.selectByExampleWithPage(example);
//        System.out.println(userPageInfo);
//    }
//
//
//
//
//
//}
