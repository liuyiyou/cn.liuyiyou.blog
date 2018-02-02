package cn.liuyiyou.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class IndexController {

    private String DEFAULT_INDEX = "index";



    @RequestMapping({"/"})
    public ModelAndView home() {
        return new ModelAndView(DEFAULT_INDEX);
    }





    @RequestMapping({"/index"})
    public ModelAndView index() {
        return new ModelAndView("/"+DEFAULT_INDEX);
    }

}
