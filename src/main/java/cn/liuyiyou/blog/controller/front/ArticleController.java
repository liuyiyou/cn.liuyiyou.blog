package cn.liuyiyou.blog.controller.front;

import cn.liuyiyou.blog.entity.Article;
import cn.liuyiyou.blog.result.Result;
import cn.liuyiyou.blog.result.ResultGenerator;
import cn.liuyiyou.blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.ofNullable;


@RestController
public class ArticleController extends BaseController {

    @Autowired
    private IArticleService articleService;

    @Autowired
    private DataSource dataSource;

    @GetMapping("articles")
    public ModelAndView articles() {
        System.out.println(dataSource);
        ModelAndView mv = new ModelAndView("articles");
        return mv;
    }

    @GetMapping("articles/{id}")
    public ModelAndView article(@PathVariable("id") int id) {
        Article article = articleService.getArticleById(id);
        ModelAndView mv = new ModelAndView("article");
        mv.addObject("article", article);
        return mv;
    }

    @PostMapping("list")
    public Result list(@RequestParam("categoryId") Integer categoryId,
                       @RequestParam("page") int page, @RequestParam("pagesize") int pageSize) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("page", page - 1);
        params.put("pagesize", pageSize);
        return ofNullable(
                ResultGenerator.genSuccessResult(articleService.getAllArticles(params)))
                .orElseThrow(() -> new Exception("获取文章详情失败!"));
    }

}
