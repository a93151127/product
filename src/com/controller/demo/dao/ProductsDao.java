package com.controller.demo.dao;

import java.util.List;

import com.controller.demo.domain.Products;

public interface ProductsDao {
	List<Products> findByCategory(String category);
}
