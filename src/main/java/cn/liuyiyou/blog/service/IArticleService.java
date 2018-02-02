package cn.liuyiyou.blog.service;

import cn.liuyiyou.blog.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface IArticleService {


    /**
     * 得到所有文章
     *
     * @return
     */
    PageInfo<Article> getAllArticles(Map<String,Object> params);


}