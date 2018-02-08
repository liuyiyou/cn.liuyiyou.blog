package cn.liuyiyou.blog.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/***
 * @author: liuyiyou
 * @date: 2018/2/8
 */
@Controller
public class TagController extends BaseController {

    @GetMapping("tags")
    public ModelAndView category() {
        return new ModelAndView("tags");
    }
}
