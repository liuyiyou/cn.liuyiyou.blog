package cn.liuyiyou.blog.service.impl;

import cn.liuyiyou.blog.entity.Article;
import cn.liuyiyou.blog.mapper.ArticleMapper;
import cn.liuyiyou.blog.service.IArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public PageInfo<Article> getAllArticles(Map<String, Object> params) {
        PageHelper.startPage(Integer.valueOf(params.get("page").toString()), Integer.valueOf(params.get("pagesize").toString()));
        List<Article> articles = articleMapper.selectArticlesByPage(params);
        PageInfo<Article> articlePageInfo = new PageInfo<>(articles);
        return articlePageInfo;
    }


    public List<Article> buildArticles() {
        List<Article> articles = Lists.newArrayList();
        for (int i = 0; i < 20; i++) {
            Article article = Article.builder().id(i).createTime(new Date()).updateTime(new Date()).title("这是标题" + i).categoryName("测试").introduction("这是简介" + i).build();
            articles.add(article);
        }
        return articles;
    }
}
