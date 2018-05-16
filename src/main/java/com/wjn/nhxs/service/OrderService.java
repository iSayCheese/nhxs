package com.wjn.nhxs.service;

import java.util.List;
import com.wjn.nhxs.model.OrderCustom;

public interface OrderService {


	OrderCustom save(OrderCustom orderCustom);

	List<OrderCustom> getOrder(int id);

}
