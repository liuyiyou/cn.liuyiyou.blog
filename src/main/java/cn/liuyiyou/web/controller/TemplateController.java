package cn.liuyiyou.web.controller;

import cn.liuyiyou.web.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * User: liuyiyou
 * Date: 2017/9/8
 * Time: 下午11:43
 */
@RestController
public class TemplateController {

    /**
     * 返回JSON
     *
     * @param map
     * @return
     */
    @RequestMapping("/indexHtml")
    public User helloHtml(Map<String, Object> map) {
        User user = new User();
        user.setAccount("18600774073");
        user.setUid(1);
        map.put("user", user);
        map.put("msg", "This is a English");
        return user;
    }

    /**
     * 返回模板
     *
     * @param map
     * @return
     */
    @RequestMapping("/indexHtml2")
    public ModelAndView helloHtml2(Map<String, Object> map) {
        ModelAndView mv = new ModelAndView("user");
        User user = getUser();
        mv.addObject("user", user);
        mv.addObject("msg", "This is a English");
        return mv;
    }

    /**
     * 返回错误信息
     *
     * @param map
     * @return
     */
    @RequestMapping("/indexHtml3")
    public Map helloHtml3(Map<String, Object> map) {
        User user = getUser();
        map.put("user", user);
        map.put("msg", "This is a English");
        return map;
    }

    @RequestMapping("/indexHtml4")
    public String helloHtml4(Map<String, Object> map) {
        User user = getUser();
        map.put("user", user);
        map.put("msg", "This is a English");
        return "/index";
    }

    @RequestMapping("/indexHtml5")
    public Map helloHtml5(Map<String, Object> map) {
        User user = getUser();
        map.put("user", user);
        map.put("msg", "This is a English");
        return map;
    }


    @RequestMapping("/indexHtml6")
    public Map<String, User> helloHtml6(Map<String, User> map) {
        User user = getUser();
        map.put("user", user);
        return map;
    }


    @RequestMapping("/indexHtml7")
    public Map<String, String> helloHtml7(Map<String, String> map) {
        map.put("user", "user");
        return map;
    }

    @RequestMapping("/returnModel")
    public Model helloHtml7(Model map) {
        map.addAttribute("user",getUser());
        return map;
    }


    @RequestMapping(value = "/returnMap_1", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, String> returnMap_1(Map<String, String> map) {
        map.put("user", "user");
        return map;
    }

    @RequestMapping("/indexHtml8")
    public List<String> helloHtml8() {
        List<String> list = Arrays.asList("1", "2", "3");
        return list;
    }


    @RequestMapping("/indexHtml9")
    public List<User> helloHtml9() {
        List<User> list = Arrays.asList(getUser(), getUser(), getUser());
        return list;
    }

    public User getUser() {
        User user = new User();
        user.setAccount("121312313");
        user.setUid(1);
        return user;
    }
}
