package com.wjn.nhxs.service.impl;

import com.wjn.nhxs.dao.ProductDao;
import com.wjn.nhxs.domain.Product;
import com.wjn.nhxs.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Resource
    private ProductDao productDao;

    /** 根据id查询商品 */
    public Product getById(int id) {
        return productDao.getById(id);
    }

    /** 添加商品 */
    public void add(Product product) {
        productDao.insert(product);
    }

    /** 查询所有商品 */
    public List<Product> queryAll() {
        return productDao.queryAll();
    }

    /** 根据id删除商品 */
    public void delete(int id) {
        productDao.delete(id);
    }

    /** 修改商品 */
    public void edit(Product product) {
        productDao.update(product);
    }

    /** 按照条件查询商品 */
    public List<Product> search(String condition) {
        return productDao.search(condition);
    }

}
