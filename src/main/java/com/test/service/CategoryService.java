package com.test.service;

import java.util.List;

import com.test.entities.Category;

public interface CategoryService {
	
	List<Category> listAll();
	Category listById(int id);
	Category create(Category cate);
	Category edit(Category cate);
	Category delete(int id);
}
