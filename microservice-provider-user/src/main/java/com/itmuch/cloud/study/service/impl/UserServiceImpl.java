package com.itmuch.cloud.study.service.impl;

import com.itmuch.cloud.study.entity.SimpleUser;
import com.itmuch.cloud.study.repository.UserMapper;
import com.itmuch.cloud.study.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public SimpleUser selectById(Long id) {
        return userMapper.selectById(id);
    }
}
