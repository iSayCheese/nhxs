package com.wjn.nhxs.service;

import java.util.List;
import javax.annotation.Resource;
import com.wjn.nhxs.model.ProductCustom;

/**
 * 购物车查询
 * 
 * @author mingjun chen
 *
 */
public interface ShopCatService {

	@Resource
	/** 根据商品id数组来查询商品 */
	List<ProductCustom> show(List<Integer> ids);

}
