package com.linz.wechart_order.service;


import com.linz.wechart_order.model.SellerInfo;

/**
 * 卖家端
 * Created by linz
 * 2017-07-29 23:14
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
