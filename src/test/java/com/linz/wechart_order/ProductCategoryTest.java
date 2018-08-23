package com.linz.wechart_order;

import com.linz.wechart_order.dao.ProductCategoryDao;
import com.linz.wechart_order.model.CategoryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOne() {
        CategoryInfo categoryInfo = productCategoryDao.findOne(1);
        System.out.println(categoryInfo);
    }

    @Test
    public void save() {
        CategoryInfo categoryInfo = new CategoryInfo();
        categoryInfo.setCategoryName("服装");
        categoryInfo.setCategoryType(1);
        categoryInfo.setCreateTime(new Date());
        categoryInfo.setUpdateTime(new Date());
        CategoryInfo ret = productCategoryDao.save(categoryInfo);
        System.out.println(ret);
    }
}
