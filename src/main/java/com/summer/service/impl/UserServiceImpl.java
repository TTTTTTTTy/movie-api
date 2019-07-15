package com.summer.service.impl;

import com.summer.mapper.UserMapper;
import com.summer.model.User;
import com.summer.model.UserExample;
import com.summer.service.UserService;
import com.summer.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/11 10:11
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        if(users != null && !users.isEmpty()){
            return Result.USERNAME_EXISTS.value();
        }
        userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(user.getEmail());
        users = userMapper.selectByExample(userExample);
        if(users != null && !users.isEmpty()){
            return Result.EMAIL_EXISTS.value();
        }
        user.setPassword(new String(Base64.getEncoder().encode(user.getPassword().getBytes())));
        if(userMapper.insertSelective(user) == 1){
            return Result.SUCCESS.value();
        };
        return Result.UNKNOWN.value();
    }

    @Override
    public int login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).
                andPasswordEqualTo(new String(Base64.getEncoder().encode(password.getBytes())));
        List<User> user = userMapper.selectByExample(userExample);
        if(user == null  || user.isEmpty()){
            return Result.USER_NOT_EXISTS.value();
        }
        return Result.SUCCESS.value();
    }
}
