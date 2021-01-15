package com.sky.service;
import com.sky.exception.UserServiceMvpException;
import com.sky.pojo.User;

/**
 * @Author: Ningxb
 * @Date: 2021-01-12 13:17
 * @description: 用户管理接口
 */
public interface IUserService{
    int save(User user) throws UserServiceMvpException;
    int remove(int id) throws UserServiceMvpException;
    int update(User user) throws UserServiceMvpException;
    User findUser(int id) throws UserServiceMvpException;


}
