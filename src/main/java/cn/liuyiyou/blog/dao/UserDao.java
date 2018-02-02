package cn.liuyiyou.blog.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * User: liuyiyou
 * Date: 2017/9/8
 * Time: 下午10:21
 */
@Repository
public class UserDao {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map getUser() {
        logger.info("datasource::{}",jdbcTemplate.getDataSource());
        Map<String, Object> userMap = jdbcTemplate.queryForMap("SELECT  * FROM  t_user WHERE id = 1");
        logger.info(userMap.get("id").toString());
        logger.info(userMap.get("login_name").toString());
        return userMap;
    }

    /**
     * 这个是模拟数据库操作,在数据发送异常的时候,将异常操作存入数据库
     * @param message
     */
    public void printMsg(String message) {
        logger.error("异常信息::{}",message);
    }
}
