package com.wjn.nhxs.service;

import java.util.List;
import com.wjn.nhxs.domain.Product;

public interface ProductService {


	/** 根据id查询商品 */
	Product getById(int id);

	/** 添加商品 */
	void add(Product product);

	/** 查询所有商品 */
	List<Product> queryAll();

	/** 根据id删除商品 */
	void delete(int id);

	/** 修改商品 */
	void edit(Product product);

	/** 按照条件查询商品 */
	List<Product> search(String condition);

}
