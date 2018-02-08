package cn.liuyiyou.blog.cache;

import cn.liuyiyou.blog.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/***
 * @author: liuyiyou
 * @date: 2018/2/5
 */
public interface IArticleRedis {

    String KEY_PREFIX = Article.class.getSimpleName();


    void loadAllArticles();

    boolean addArticle(Article article);

    Article getArticle(Integer id);

    /**
     * 得到所有文章
     *
     * @return
     */
    PageInfo<Article> getAllArticles(Map<String, Object> params);
}
