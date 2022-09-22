package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Category;
import com.test.repository.CategoryRepository;
import com.test.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository cateRepo;
	
	@Override
	public List<Category> listAll() {
		
		return cateRepo.findAll();
	}

	@Override
	public Category listById(int id) {
		
		return cateRepo.findOne(id);
	}

	@Override
	public Category create(Category cate) {
		
		return cateRepo.save(cate);
	}

	@Override
	public Category edit(Category cate) {
		
		return cateRepo.save(cate);
	}

	@Override
	public Category delete(int id) {
		
		Category cate = cateRepo.findOne(id);
		if(cate != null) {
			cateRepo.delete(cate);
		}
		
		return cate;
	}

}
