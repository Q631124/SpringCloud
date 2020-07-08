package com.qi.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2019/12/5.
 */
@Controller
@RabbitListener(queues = "rabbit")
public class MqController {

    @RabbitHandler
    public void process(String message){
        System.out.println("收到消息:" + message);
    }

}
