package com.linz.wechart_order.repository;


import com.linz.wechart_order.model.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by linz
 * 2017-07-23 23:04
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
