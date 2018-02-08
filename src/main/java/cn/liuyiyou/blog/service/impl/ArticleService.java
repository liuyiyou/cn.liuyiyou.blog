package cn.liuyiyou.blog.service.impl;

import cn.liuyiyou.blog.cache.IArticleRedis;
import cn.liuyiyou.blog.entity.Article;
import cn.liuyiyou.blog.mapper.ArticleMapper;
import cn.liuyiyou.blog.service.IArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private IArticleRedis articleRedis;

    @Override
    public Article getArticleById(Integer id) {
        Article article = articleRedis.getArticle(id);
        return article;
    }

    @Override
    public PageInfo<Article> getAllArticles(Map<String, Object> params) {
        PageHelper.startPage(Integer.valueOf(params.get("page").toString()), Integer.valueOf(params.get("pagesize").toString()));
        List<Article> articles = articleMapper.selectArticlesByPage(params);
        PageInfo<Article> articlePageInfo = new PageInfo<>(articles);
        return articlePageInfo;
    }
}
