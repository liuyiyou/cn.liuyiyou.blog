package cn.liuyiyou.blog.init;

import cn.liuyiyou.blog.cache.IArticleRedis;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * @author: liuyiyou
 * @date: 2018/2/5
 */
@Component
public class Init implements InitializingBean {

    @Autowired
    private IArticleRedis articleCache;


    @Override
    public void afterPropertiesSet()  {
       // articleCache.loadAllArticles();
    }
}
