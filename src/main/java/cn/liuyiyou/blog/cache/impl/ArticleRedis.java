package cn.liuyiyou.blog.cache.impl;

import cn.liuyiyou.blog.cache.IArticleRedis;
import cn.liuyiyou.blog.entity.Article;
import cn.liuyiyou.blog.mapper.ArticleMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

/***
 * @author: liuyiyou
 * @date: 2018/2/5
 */
@Log
@Repository
public class ArticleRedis implements IArticleRedis {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private Jedis jedis;


    @Override
    public void loadAllArticles() {
        List<Article> articles = articleMapper.selectAll();
        articles.forEach(article ->
                jedis.set(IArticleRedis.KEY_PREFIX + ":" + article.getId(), JSON.toJSONString(article)));
    }

    @Override
    public boolean addArticle(Article article) {
        int result = articleMapper.insert(article);
        jedis.set(IArticleRedis.KEY_PREFIX + ":" + article.getId(), JSON.toJSONString(article));
        return result > 0;
    }

    @Override
    public Article getArticle(Integer id) {
        String articleStr = jedis.get(IArticleRedis.KEY_PREFIX + ":" + id);
        if (!StringUtils.isEmpty(articleStr)) {
            log.info("from cache");
            Article article = JSONObject.parseObject(articleStr, Article.class);
            return article;
        } else {
            log.info("from db");
            Article article = articleMapper.selectById(id);
            jedis.set(IArticleRedis.KEY_PREFIX + ":" + article.getId(), JSON.toJSONString(article));
            return article;
        }

    }

    @Override
    public PageInfo<Article> getAllArticles(Map<String, Object> params) {
        PageHelper.startPage(Integer.valueOf(params.get("page").toString()), Integer.valueOf(params.get("pagesize").toString()));
        List<Article> articles = articleMapper.selectArticlesByPage(params);
        PageInfo<Article> articlePageInfo = new PageInfo<>(articles);
        return articlePageInfo;
    }
}
