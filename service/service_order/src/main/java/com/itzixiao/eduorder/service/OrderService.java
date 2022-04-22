package com.itzixiao.eduorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.eduorder.entity.Order;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author zixiao
 * -03-13
 */
public interface OrderService extends IService<Order> {

    //1 生成订单的方法
    String createOrders(String courseId, String memberIdByJwtToken);
}
