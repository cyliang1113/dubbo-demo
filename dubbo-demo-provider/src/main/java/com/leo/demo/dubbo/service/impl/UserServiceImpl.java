package com.leo.demo.dubbo.service.impl;

import com.leo.demo.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public String getUsername() {
        return "Tom";
    }
}
