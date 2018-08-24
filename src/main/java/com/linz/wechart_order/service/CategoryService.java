package com.linz.wechart_order.service;

import com.linz.wechart_order.model.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by linz
 * 2017-05-09 10:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
