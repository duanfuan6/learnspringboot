package com.itmuch.cloud.study.repository;

import com.itmuch.cloud.study.entity.SimpleUser;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    SimpleUser selectById(@Param("id")Long id);
}
