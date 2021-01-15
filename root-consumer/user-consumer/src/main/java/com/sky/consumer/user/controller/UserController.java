package com.sky.consumer.user.controller;

import com.sky.exception.UserServiceMvpException;
import com.sky.pojo.User;
import com.sky.service.IUserService;
import com.sky.util.RespResult;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author: Ningxb
 * @Date: 2021-01-09 18:32
 * @description: ${description}
 */
@RestController
//@RequestMapping(value="user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @DubboReference
    IUserService userService;

    @PostMapping("/user")
    public RespResult<User> saveUser(@RequestBody User user) throws UserServiceMvpException {
        //user.setGender(null);
        //logger.debug("【DEBUG】---------"+user.getName()+"----------------------");
        userService.save(user);

        /*try{
            userService.save(user);
        }catch(Exception e){

        }*/
        return RespResult.ok();

    }
}
