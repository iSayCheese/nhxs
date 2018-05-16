package com.wjn.nhxs.service.impl;

import com.wjn.nhxs.dao.ShopCatDao;
import com.wjn.nhxs.model.ProductCustom;
import com.wjn.nhxs.service.ShopCatService;

import javax.annotation.Resource;
import java.util.List;

public class ShopCatServiceImpl implements ShopCatService{
    @Resource
    private ShopCatDao shopcatDao;

    /** 根据商品id数组来查询商品 */
    public List<ProductCustom> show(List<Integer> ids) {
        return shopcatDao.getProductCustomByIds(ids);
    }

}
