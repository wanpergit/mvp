package com.sky.service;
import com.sky.exception.UserServiceMvpException;
import com.sky.mapper.UserMapper;
import com.sky.pojo.User;
import com.sky.util.RespResult;
import exception.BaseMvpException;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Ningxb
 * @Date: 2021-01-12 18:01
 * @description: ${description}
 */
@DubboService(timeout = 2000)
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public int save(User user) throws UserServiceMvpException {
        try{
            userMapper.insertUser(user);
        }catch(Exception e){
            throw new UserServiceMvpException(50000,"用户数据插入失败");
        }
        return user.getId();
    }

    @Override
    public int remove(int id) throws UserServiceMvpException {
        return 0;
    }

    @Override
    public int update(User user) throws UserServiceMvpException {
        return 0;
    }

    @Override
    public User findUser(int id) throws UserServiceMvpException {
        return null;
    }
}
