package cn.liuyiyou.web.mapper;

import cn.liuyiyou.AbstractTest;
import cn.liuyiyou.web.model.User;
import cn.liuyiyou.web.model.UserExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author: liuyiyou
 * @date: 2017/11/14
 * Time: 上午9:16
 */
public class UserMapperTest extends AbstractTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    @Transactional
    @Rollback
    public void insertTest() {
        User user = new User();
        user.setUid(99999);
        user.setUserType((byte)1);
        userMapper.insert(user);
        User dbUser = userMapper.selectByPrimaryKey(user.getUid());
        assertEquals(user.getUid(), dbUser.getUid());

    }

    @Test
    @Transactional
    @Rollback
    public void insertSelectiveTest() {
        User user = new User();
        user.setUid(99999);
        user.setUserType((byte)1);
        userMapper.insertSelective(user);
        User dbUser = userMapper.selectByPrimaryKey(user.getUid());
        assertEquals(user.getUid(), dbUser.getUid());

    }


    @Test
    public void selectByPKTest() {
        User user = userMapper.selectByPrimaryKey(1);
        assertEquals("15920556068", user.getAccount());

    }

    @Test
    public void selectByKey2Test() {
        //User user = userMapper.selectByKey2(1);
        //assertEquals("15920556068", user.getAccount());

    }




    @Test
    public void countByExampleTest() {
        UserExample example = new UserExample();
        example.createCriteria().andLastChannelEqualTo((byte) 5);
        int count = userMapper.countByExample(example);
        assertEquals(1320, count);

    }

    @Test
    public void selectByExampleTest() {
        UserExample example = new UserExample();
        example.createCriteria().andLastChannelEqualTo((byte) 5);
        List<User> users = userMapper.selectByExample(example);
        assertEquals(1320, users.size());

    }

    @Test
    public void selectByParamsTest() {
        User user = new User();
        user.setLastChannel((byte)5);
        List<User> users = userMapper.selectByParams(user);
        assertEquals(1320, users.size());

    }


    @Test
    @Transactional
    @Rollback
    public void deleteByIdTest() {
        int count = userMapper.deleteByPrimaryKey(1000154293);
        assertEquals(1, count);
    }


    @Test
    @Transactional
    @Rollback
    public void deleteByExample() {
        UserExample example = new UserExample();
        example.createCriteria().andLastChannelEqualTo((byte) 5);
        int count = userMapper.deleteByExample(example);
        assertEquals(1320, count);
    }


}
