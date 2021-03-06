package com.linz.wechart_order.service;


import com.linz.wechart_order.dto.OrderDTO;

/**
 * 买家
 * Created by linz
 * 2017-06-22 00:11
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
