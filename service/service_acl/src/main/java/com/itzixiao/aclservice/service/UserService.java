package com.itzixiao.aclservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.aclservice.entity.User;


public interface UserService extends IService<User> {

    // 从数据库中取出用户信息
    User selectByUsername(String username);
}
