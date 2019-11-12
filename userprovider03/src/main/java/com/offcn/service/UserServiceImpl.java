package com.offcn.service;

import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public User select(Integer eid) {
       return userMapper.selectByPrimaryKey(eid);
    }
}
