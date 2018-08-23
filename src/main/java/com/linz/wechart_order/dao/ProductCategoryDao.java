package com.linz.wechart_order.dao;

import com.linz.wechart_order.model.CategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryDao extends JpaRepository<CategoryInfo, Integer> {
}
