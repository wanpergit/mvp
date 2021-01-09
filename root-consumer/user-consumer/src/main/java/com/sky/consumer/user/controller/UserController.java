package com.sky.consumer.user.controller;

import com.sky.user.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ningxb
 * @Date: 2021-01-09 18:32
 * @description: ${description}
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference
    IUserService userService;

    @GetMapping("/single")
    public String getUser(){
        return userService.getUser();
    }
}
