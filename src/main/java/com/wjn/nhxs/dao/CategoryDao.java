package com.wjn.nhxs.dao;

import java.util.List;
import com.wjn.nhxs.domain.Category;
import com.wjn.nhxs.model.ProductCustom;

public interface CategoryDao {

	/** 得到所有商品分类 */
	List<Category> getAll();

	/** 根据分类id查询商品分类 */
	Category getById(int id);

	/** 根据商品分类id查询所有子类分类对象List集合 */
	List<Category> getChildrenIds(int id);

	/** 根据商品分类id查询所有商品及商品分类，最后返回商品包装类List集合 */
	List<ProductCustom> getByCategoryId(int id);
}
