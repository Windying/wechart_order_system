//package com.linz.wechart_order.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
///**
// * Created by linz
// * 2017-07-03 01:25
// */
//@Component
//public class WechatMpConfig {
//
//    @Autowired
//    private WechatAccountConfig accountConfig;
//
//    @Bean
//    public WxMpService wxMpService() {
//        WxMpService wxMpService = new WxMpServiceImpl();
//        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
//        return wxMpService;
//    }
//
//    @Bean
//    public WxMpConfigStorage wxMpConfigStorage() {
//        WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();
//        wxMpConfigStorage.setAppId(accountConfig.getMpAppId());
//        wxMpConfigStorage.setSecret(accountConfig.getMpAppSecret());
//        return wxMpConfigStorage;
//    }
//}
