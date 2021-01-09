package com.sky.service;

import com.sky.user.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: Ningxb
 * @Date: 2021-01-09 01:08
 * @description: ${description}
 */
@DubboService
public class UserServiceImpl implements IUserService {
    @Override
    public String getUser() {
        return "Hello "+System.currentTimeMillis();
    }
}
