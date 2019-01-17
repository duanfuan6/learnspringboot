package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.entity.SimpleUser;

@RestController
public class UserController {
  @Autowired
  private IUserService userService;

  @GetMapping("/{id}")
  public SimpleUser findById(@PathVariable Long id) {
    SimpleUser findOne = this.userService.selectById(id);
    return findOne;
  }
}
