package cn.liuyiyou.blog;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.JedisPoolConfig;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = "cn.liuyiyou.blog.mapper")
@EnableTransactionManagement
@Log
public class Application {


    @Autowired
    private Environment env;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(getDataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }


//    /**
//     * 使用druind作为数据源
//     *
//     * @return
//     */
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource getDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }

    /**
     * 使用redis做缓存
     * </bean>
     *
     * @return
     */
//    @Bean
//    @ConfigurationProperties(prefix = "spring.redis")
//    public JedisPoolConfig getRedisConfig() {
//        JedisPoolConfig config = new JedisPoolConfig();
//        logger.info("config::{}", config);
//        return config;
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.redis")
//    public JedisConnectionFactory getConnectionFactory() {
//        JedisConnectionFactory factory = new JedisConnectionFactory();
//        JedisPoolConfig config = getRedisConfig();
//        factory.setPoolConfig(config);
//        logger.info("minIdle:{}", config.getMinIdle());
//        return factory;
//    }


}
