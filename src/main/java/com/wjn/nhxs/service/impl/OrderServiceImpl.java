package com.wjn.nhxs.service.impl;

import com.wjn.nhxs.dao.OrderDao;
import com.wjn.nhxs.model.OrderCustom;
import com.wjn.nhxs.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderDao orderDao;

    public OrderCustom save(OrderCustom orderCustom) {
        return orderDao.insert(orderCustom);
    }

    public List<OrderCustom> getOrder(int id) {
        return orderDao.getOrderByUserId(id);
    }
}
