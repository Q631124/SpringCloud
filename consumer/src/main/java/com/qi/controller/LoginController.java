package com.qi.controller;

import com.qi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/12/4.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String login(Model model){
        User user = new User();
        user.setId("100");
        user.setNickName("王二");
        user.setPassword("110");
        user.setSex(0);
        model.addAttribute("user", user);
        return "index";
    }

}
