package cn.liuyiyou.blog.controller;

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

import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.ofNullable;


@RestController
public class ArticleController {

    @Autowired
    private IArticleService articleService;


    @GetMapping("articles")
    public ModelAndView articles() {
        //List<Article> articles = articleService.getAllArticles().getList();
        ModelAndView mv = new ModelAndView("articles");
        // mv.addObject("articles", articles);
        return mv;
    }

    @GetMapping("article/{id}")
    public ModelAndView article(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("article");
        return mv;
    }


    @PostMapping("list")
//    categoryId=1&subCategoryId=&tagId=&page=3&pagesize=6
    public Result list(@RequestParam("categoryId") Integer categoryId,
                       @RequestParam("page") int page, @RequestParam("pagesize") int pageSize) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("page", page-1);
        params.put("pagesize", pageSize);
        return ofNullable(
                ResultGenerator.genSuccessResult(articleService.getAllArticles(params)))
                .orElseThrow(() -> new Exception("获取文章详情失败!"));
    }

//    /**
//     * 文章详情
//     *
//     * @return
//     */
//    @RequestMapping({"/article/{id}"})
//    public ModelAndView article(@PathVariable("id") int id) throws Exception {
//        List<Tag> tags = tagService.selectByParamsWithPage(new Tag() {{
//            setBlogId(blogId);
//        }}).getList();
//        return ofNullable(blogService.getByKey(blogId))
//                .map(blog -> {
//                    blog.setTags(tags);
//                    ModelAndView mv = new ModelAndView("article");
//                    mv.addObject("blog", blog);
//                    return mv;
//                })
//                .orElseThrow(() -> new Exception("获取文章详情失败!"));
//    }
}
