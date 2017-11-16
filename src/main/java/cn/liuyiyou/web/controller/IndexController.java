package cn.liuyiyou.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 默认首页,第一个和第二个的view不一样,springboot也能分清
 * @author : liuyiyou
 * Date: 2017/9/8
 * Time: 下午10:06
 */
@RestController
public class IndexController {

    private String DEFAULT_INDEX = "index";


    /**
     * 因为是注释的是@RestController,如果返回值是String,前台返回的是内容而不是模板
     * @return
     */
    @RequestMapping({"/"})
    public ModelAndView home() {
        return new ModelAndView(DEFAULT_INDEX);
    }

    @RequestMapping({"/index"})
    public ModelAndView index() {
        System.out.println("xxxx");
        return new ModelAndView("/"+DEFAULT_INDEX);
    }

}
