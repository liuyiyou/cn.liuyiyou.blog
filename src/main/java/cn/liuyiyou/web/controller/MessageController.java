package cn.liuyiyou.web.controller;

import cn.liuyiyou.web.model.Message;
import cn.liuyiyou.web.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: liuyiyou
 * @date: 2017/11/17
 * Time: 下午11:15
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/list")
    public List<Message> list(){
        return messageService.selectByParamsWithPage(new Message()).getList();
    }
}
