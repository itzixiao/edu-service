package com.itzixiao.aclservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.aclservice.entity.Role;

import java.util.List;
import java.util.Map;


public interface RoleService extends IService<Role> {

    //根据用户获取角色数据
    Map<String, Object> findRoleByUserId(String userId);

    //根据用户分配角色
    void saveUserRoleRealtionShip(String userId, String[] roleId);

    List<Role> selectRoleByUserId(String id);
}
