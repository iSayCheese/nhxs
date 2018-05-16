package com.wjn.nhxs.dao;

import java.util.List;
import com.wjn.nhxs.model.OrderCustom;

public interface OrderDao {

	/** 保存订单，同时返回该订单显示给用户 */
	OrderCustom insert(OrderCustom orderCustom);

	/** 添加订单表和商品表的关系 */
	void insertOrderDetail(OrderCustom orderCustom, int orderId);

	/** 查询我的订单 @param id */
	List<OrderCustom> getOrderByUserId(int id);
}
