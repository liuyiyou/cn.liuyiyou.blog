package cn.liuyiyou.web.controller;

import cn.liuyiyou.web.model.Blog;
import cn.liuyiyou.web.model.Tag;
import cn.liuyiyou.web.service.BlogService;
import cn.liuyiyou.web.service.TagService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") int page) {
        Blog blog = new Blog();
        blog.setPage(1);
        blog.setPageSize(12);
        PageInfo<Blog> blogPageInfo = blogService.selectBlogPageWithTags(blog);
        ModelAndView mv = new ModelAndView("blog");
        mv.addObject("blogs", blogPageInfo.getList());
        return mv;
    }

    /**
     * 文章详情
     *
     * @return
     */
    @RequestMapping({"/article/{blogId}"})
    public ModelAndView article(@PathVariable("blogId") int blogId) {
        Blog blog = blogService.getByKey(blogId);
        Tag tag = new Tag() {{
            setBlogId(blogId);
        }};
        List<Tag> tags = tagService.selectByParamsWithPage(tag).getList();
        blog.setTags(tags);
        ModelAndView mv = new ModelAndView("article");
        mv.addObject("blog", blog);
        return mv;
    }
}
