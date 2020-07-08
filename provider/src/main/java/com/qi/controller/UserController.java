package com.qi.controller;

import com.qi.entity.User;
import com.qi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/27.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(String id){
        String str = "我好难";
        System.out.println(str);
        return userService.getUser(id);
    }


}
