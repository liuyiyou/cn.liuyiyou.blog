package cn.liuyiyou.blog.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * User: liuyiyou
 * Date: 2017/9/11
 * Time: 下午4:33
 */
@Configuration
@EnableCaching
@EnableAutoConfiguration
@ConfigurationProperties("spring.redis")
public class RedisCacheConfiguration extends CachingConfigurerSupport {


//    @Value("${spring.redis.host}")
//    String host;

    @Bean
    public Jedis jedis() {
        return new Jedis("127.0.0.1", 63790);
    }

    @Bean
    public JedisPoolConfig config() {
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    public JedisPool redisPoolFactory() {
        JedisPool jedisPool = new JedisPool(config(), "127.0.0.1", 63790);
        return jedisPool;
    }
}
