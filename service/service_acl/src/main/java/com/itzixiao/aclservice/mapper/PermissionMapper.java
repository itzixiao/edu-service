package com.itzixiao.aclservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itzixiao.aclservice.entity.Permission;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {

    List<String> selectPermissionValueByUserId(String id);

    List<String> selectAllPermissionValue();

    List<Permission> selectPermissionByUserId(String userId);
}
