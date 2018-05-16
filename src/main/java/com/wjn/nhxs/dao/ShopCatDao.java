package com.wjn.nhxs.dao;

import java.util.List;
import com.wjn.nhxs.model.ProductCustom;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCatDao {

	/** 根据商品id数组来查询商品信息 */
	List<ProductCustom> getProductCustomByIds(List<Integer> ids);
}
