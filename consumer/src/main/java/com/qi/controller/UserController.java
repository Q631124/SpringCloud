package com.qi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/11/26.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        // 从注册中心获取提供方的信息,http://提供方应用的名字/路径,String类型
        String s = restTemplate.getForObject("http://provider/ticket", String.class);

        return name + "购买了" + s;
    }

    //启动容错处理，调用出错后访问getUserFallbackMethod方法并返回
    @HystrixCommand(fallbackMethod = "getUserFallbackMethod")
    @GetMapping("/getUser")
    public User getUser(String id){
        User user = restTemplate.getForObject("http://provider/getUser?id=" + id, User.class);
        return user;
    }

    public User getUserFallbackMethod(String id){
        User user = new User();
        user.setId(id);
        user.setStatus("error");
        return user;
    }


}
