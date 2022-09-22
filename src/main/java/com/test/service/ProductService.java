package com.test.service;

import java.util.List;

import com.test.entities.Product;

public interface ProductService {
	
	List<Product> listAll();
	Product listById(int id);
	Product create(Product pro);
	Product edit(Product pro);
	Product delete(int id);
	List<Product> findByCategoryId(int id);
}
