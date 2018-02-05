package cn.liuyiyou.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ExceptionController {

    /**
     * 返回到页面的异常
     * @return
     */
    @RequestMapping("/page")
    public int pageError() {
        return 1 / 0;
    }


    @RequestMapping("/json")
    @ResponseBody
    public String jsonError() throws Exception {
        throw  new Exception("这是异常信息");
    }
}
