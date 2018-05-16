package com.wjn.nhxs.controller;

import java.util.List;

import javax.annotation.Resource;

import com.wjn.nhxs.domain.Category;
import com.wjn.nhxs.model.ProductCustom;
import com.wjn.nhxs.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 商品分类Controller
 * 
 * @author mingjun chen
 *
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Resource
	private CategoryService categoryService;

	/** 根据id查询此id下所有商品 */
	@RequestMapping("/getById/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		List<ProductCustom> categories = categoryService.getByCategoryId(id);
		model.addAttribute("categories", categories);
		model.addAttribute("pId", id);
		model.addAttribute("arg", "up"); // 添加首次升序排列
		return "list";
	}

	/** 得到所有商品分类 */
	@RequestMapping("/show")
	public String show(Model model) {
		List<Category> categoryList = categoryService.getAll();
		model.addAttribute("categoryList", categoryList);
		return "index";
	}

}
