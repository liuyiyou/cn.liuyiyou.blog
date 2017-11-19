package cn.liuyiyou.web.controller;

import cn.liuyiyou.web.model.Blog;
import cn.liuyiyou.web.model.Tag;
import cn.liuyiyou.web.service.BlogService;
import cn.liuyiyou.web.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static java.util.Optional.ofNullable;

/**
 * @author: liuyiyou
 * @date: 2017/11/17
 * Time: 下午9:29
 */
@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TagService tagService;

    /**
     * 博客列表
     *
     * @return
     */
    @RequestMapping({"/blog"})
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") int page) throws Exception {
        return ofNullable(blogService.selectBlogPageWithTags(new Blog() {{
            setPage(1);
            setPageSize(12);
        }})).map(b -> {
            ModelAndView mv = new ModelAndView("blog");
            mv.addObject("blogs", b.getList());
            return mv;
        }).orElseThrow(() -> new Exception("获取文章列表异常!"));
    }


    /**
     * 文章详情
     *
     * @return
     */
    @RequestMapping({"/article/{blogId}"})
    public ModelAndView article(@PathVariable("blogId") int blogId) throws Exception {
        List<Tag> tags = tagService.selectByParamsWithPage(new Tag() {{
            setBlogId(blogId);
        }}).getList();
        return ofNullable(blogService.getByKey(blogId))
                .map(blog -> {
                    blog.setTags(tags);
                    ModelAndView mv = new ModelAndView("article");
                    mv.addObject("blog", blog);
                    return mv;
                })
                .orElseThrow(() -> new Exception("获取文章详情失败!"));
    }
}
