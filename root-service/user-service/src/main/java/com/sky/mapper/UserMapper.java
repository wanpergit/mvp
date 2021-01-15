package com.sky.mapper;

import com.sky.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Ningxb
 * @Date: 2021-01-12 13:20
 * @description: ${description}
 */
@Mapper
public interface UserMapper{
    int insertUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    User queryUserById(int id);
}
