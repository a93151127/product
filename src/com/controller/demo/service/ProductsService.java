package com.controller.demo.service;

import java.util.List;

import com.controller.demo.domain.Products;

public interface ProductsService {
	List<Products> queryByCategory(String category);
}
