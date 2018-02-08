package cn.liuyiyou.blog.service.impl;

import cn.liuyiyou.blog.entity.Menu;
import cn.liuyiyou.blog.service.IMenuService;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @author: liuyiyou
 * @date: 2018/2/8
 */
@Service
public class MenuService implements IMenuService {


    @Override
    public List<Menu> getAllMenus() {
        List<Menu> menus = Lists.newArrayList();
        Menu menu = Menu.builder().id(1).name("文章").permalink("/articles").sort(1).build();
        menus.add(menu);
        menu = Menu.builder().id(2).name("分类").permalink("/categories").sort(2).build();
        menus.add(menu);
        menu = Menu.builder().id(3).name("标签").permalink("/tags").sort(3).build();
        menus.add(menu);
        menu = Menu.builder().id(3).name("关于").permalink("/about").sort(4).build();
        menus.add(menu);
        return menus;
    }
}
