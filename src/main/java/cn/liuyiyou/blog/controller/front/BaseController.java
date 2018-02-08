package cn.liuyiyou.blog.controller.front;

import cn.liuyiyou.blog.entity.Menu;
import cn.liuyiyou.blog.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;


@Controller
public class BaseController {

    @Autowired
    private IMenuService menuService;

    @ModelAttribute("menus")
    public List<Menu> getAllMenus() {
        List<Menu> allMenus = menuService.getAllMenus();
        return allMenus;
    }

}
