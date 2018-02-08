//package cn.liuyiyou.blog.service;
//
//import cn.liuyiyou.AbstractTest;
//import cn.liuyiyou.blog.entity.User;
//import cn.liuyiyou.blog.entity.UserExample;
//import com.github.pagehelper.PageInfo;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author: liuyiyou
// * @date: 2017/11/14
// * Time: 上午9:38
// */
//public class ArticleRedisTest extends AbstractTest {
//
//    @Autowired
//    private UserService userService;
//
//
//    @Test
//    public  void  selectByExamplePageTest(){
//        UserExample example = new UserExample(){{
//            setPageSize(10);
//            setPage(1);
//        }};
//        example.createCriteria().andLastChannelEqualTo((byte) 5);
//        PageInfo<User> pageInfo = userService.selectByExampleWithPage(example);
//        System.out.println(pageInfo);
//    }
//
//    @Test
//    public  void  selectByParamsPageTest(){
//        User user = new User();
//        user.setPage(1);
//        user.setPageSize(10);
//        user.setLastChannel((byte)5);
//        PageInfo<User> pageInfo = userService.selectByParamsWithPage(user);
//        System.out.println(pageInfo);
//    }
//
//
//}
