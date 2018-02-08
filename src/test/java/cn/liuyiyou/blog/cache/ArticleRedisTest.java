package cn.liuyiyou.blog.cache;//package cn.liuyiyou.blog.service;

import cn.liuyiyou.AbstractTest;
import cn.liuyiyou.blog.entity.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author: liuyiyou
 * @date: 2017/11/14
 * Time: 上午9:38
 */
public class ArticleRedisTest extends AbstractTest {

    @Autowired
    private IArticleRedis articleRedis;

    @Test
    public void  getFromCache(){
        articleRedis.getArticle(149);
    }

    @Test
    public void addTest(){
        articleRedis.addArticle(new Article(){{
            setTitle("测试标题");
            setCreateTime(new Date());

        }});
    }

}
