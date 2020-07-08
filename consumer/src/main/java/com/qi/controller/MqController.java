package com.qi.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/12/5.
 */
@RestController
@RequestMapping("/mq")
public class MqController {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @RequestMapping("/send")
    public String send(String message){
        rabbitmqTemplate.convertAndSend("rabbit", message);
        return "OK";
    }

}
