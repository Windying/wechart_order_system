package com.linz.wechart_order.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by linz
 * 2017-07-04 01:30
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
