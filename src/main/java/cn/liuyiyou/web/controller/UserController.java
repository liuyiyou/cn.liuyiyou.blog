package cn.liuyiyou.web.controller;

import cn.liuyiyou.web.model.User;
import cn.liuyiyou.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: liuyiyou
 * Date: 2017/9/9
 * Time: 上午11:47
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = userService.getByKey(id);
        return user;
    }
}