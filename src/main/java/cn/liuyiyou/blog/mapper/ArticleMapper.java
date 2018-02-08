package cn.liuyiyou.blog.mapper;

import cn.liuyiyou.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ArticleMapper {

    List<Article> selectArticlesByPage(Map<String, Object> params);

    List<Article> selectAll();

    int insert(Article article);

    Article selectById(Integer id);
}