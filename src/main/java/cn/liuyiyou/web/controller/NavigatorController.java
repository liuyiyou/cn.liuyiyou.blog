package cn.liuyiyou.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 菜单导航栏:后期存放到db中
 * @author: liuyiyou
 * @date: 2017/11/17
 * Time: 下午7:35
 */

@Controller
public class NavigatorController {

    /**
     * 首页
     * @return
     */
    @RequestMapping({"/index_v1"})
    public ModelAndView indexV1() {
        return new ModelAndView("index_v1");
    }

    /**
     * 空白页
     * @return
     */
    @RequestMapping({"/empty_page"})
    public ModelAndView emptyPage() {
        return new ModelAndView("empty_page");
    }


    /**
     * 收件列表
     * @return
     */
    @RequestMapping({"/mailbox"})
    public ModelAndView mailbox() {
        return new ModelAndView("mailbox");
    }

    /**
     * 博客列表
     * @return
     */
    @RequestMapping({"/blog"})
    public ModelAndView blog() {
        return new ModelAndView("blog");
    }
}
