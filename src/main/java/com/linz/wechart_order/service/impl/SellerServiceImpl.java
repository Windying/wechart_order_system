package com.linz.wechart_order.service.impl;

import com.linz.wechart_order.model.SellerInfo;
import com.linz.wechart_order.repository.SellerInfoRepository;
import com.linz.wechart_order.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linz
 * 2017-07-29 23:15
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
