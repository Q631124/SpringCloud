package com.qi.controller;

import com.qi.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/28.
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId("2");
        user.setNickName("小明");
        user.setPassword("111");
        user.setSex(1);
        //return user;
        return null;
    }

}



