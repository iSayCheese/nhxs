package com.wjn.nhxs.service;

import java.util.List;
import com.wjn.nhxs.domain.Category;
import com.wjn.nhxs.model.ProductCustom;

public interface CategoryService {



	/** 所有商品分类 */
	List<Category> getAll();

	/** 通过商品分类id查询该分类所有商品 */
	List<ProductCustom> getByCategoryId(int id);

}
