package com.controller.demo.service.imp;

import java.util.List;

import com.controller.demo.dao.ProductsDao;
import com.controller.demo.dao.imp.ProductsDaoJdbcImp;
import com.controller.demo.domain.Products;
import com.controller.demo.service.ProductsService;

public class ProductsServiceImp implements ProductsService{
	ProductsDao productdao=new ProductsDaoJdbcImp();
	@Override
	public List<Products> queryByCategory(String category) {
		return productdao.findByCategory(category);
	}

}
