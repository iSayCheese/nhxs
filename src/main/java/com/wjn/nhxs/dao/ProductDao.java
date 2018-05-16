package com.wjn.nhxs.dao;

import java.util.List;
import com.wjn.nhxs.domain.Product;

public interface ProductDao {

	/** 根据商品分类id查询商品 */
	List<Product> getByCategoryId(int id);

	/**
	 * 根据商品分类查询对应商品 public List<ProductCustom>
	 * getProductByCategoryId(List<Category> categories) throws SQLException {
	 * QueryRunner queryRunner = new QueryRunner(dataSource); String sql =
	 * "SELECT * FROM t_product WHERE categoryId=?"; List<ProductCustom> pcList
	 * = new ArrayList<ProductCustom>(); for (Category category : categories) {
	 * List<Product> products = queryRunner.query(sql, new
	 * BeanListHandler<Product>(Product.class), category.getCategoryId()); for
	 * (Product product : products) { ProductCustom category2 = new
	 * ProductCustom(); category2.setProduct(product);
	 * category2.setCategory(category); pcList.add(category2); } } return
	 * pcList; }
	 * */

	/** 根据id查询商品 */
	Product getById(int id);

	/** 商品修改 */
	void update(Product product);

	/** 商品添加 */
	void insert(Product p);

	/** 查询所有商品 */
	List<Product> queryAll();

	/** 根据id删除商品 */
	void delete(int id);

	/** 根据查询条件查询商品，采用like模糊查询 */
	List<Product> search(String condition);

}
