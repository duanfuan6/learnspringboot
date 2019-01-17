package com.itmuch.cloud.study.service;

import com.itmuch.cloud.study.entity.SimpleUser;

public interface IUserService {

    SimpleUser selectById(Long id);
}
