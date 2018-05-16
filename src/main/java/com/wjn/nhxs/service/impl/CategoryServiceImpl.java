package com.wjn.nhxs.service.impl;

import com.wjn.nhxs.dao.CategoryDao;
import com.wjn.nhxs.domain.Category;
import com.wjn.nhxs.model.ProductCustom;
import com.wjn.nhxs.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Resource
    private CategoryDao categoryDao;

    /** 所有商品分类 */
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    /** 通过商品分类id查询该分类所有商品 */
    public List<ProductCustom> getByCategoryId(int id) {
        return categoryDao.getByCategoryId(id);
    }
}
