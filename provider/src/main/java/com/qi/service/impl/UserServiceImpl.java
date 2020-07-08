package com.qi.service.impl;

import com.qi.entity.User;
import com.qi.mapper.UserMapper;
import com.qi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/11/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String id) {
        return userMapper.getUser(id);
    }
}
