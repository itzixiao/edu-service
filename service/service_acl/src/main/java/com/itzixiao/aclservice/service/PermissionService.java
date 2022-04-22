package com.itzixiao.aclservice.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.aclservice.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限 服务类
 * </p>
 *
 * @author zixiao
 * @since 2020-01-12
 */
public interface PermissionService extends IService<Permission> {

    //获取全部菜单
    List<Permission> queryAllMenu();

    //根据角色获取菜单
    List<Permission> selectAllMenu(String roleId);

    //给角色分配权限
    void saveRolePermissionRealtionShip(String roleId, String[] permissionId);

    //递归删除菜单
    void removeChildById(String id);

    //根据用户id获取用户菜单
    List<String> selectPermissionValueByUserId(String id);

    List<JSONObject> selectPermissionByUserId(String id);

    //获取全部菜单
    List<Permission> queryAllMenuEdu();

    //递归删除菜单
    void removeChildByIdEdu(String id);

    //给角色分配权限
    void saveRolePermissionRealtionShipEdu(String roleId, String[] permissionId);
}
