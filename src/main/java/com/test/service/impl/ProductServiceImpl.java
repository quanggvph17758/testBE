package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Product;
import com.test.repository.ProductRepository;
import com.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository proRepo;

	@Override
	public List<Product> listAll() {
		
		return proRepo.findAll();
	}

	@Override
	public Product listById(int id) {
		
		return proRepo.findOne(id);
	}

	@Override
	public Product create(Product pro) {
		
		return proRepo.save(pro);
	}

	@Override
	public Product edit(Product pro) {
		
		return proRepo.save(pro);
	}

	@Override
	public Product delete(int id) {
		
		Product pro = proRepo.findOne(id);
		
		if (pro != null) {
			proRepo.delete(pro);
		}
		
		return pro;
	}

	@Override
	public List<Product> findByCategoryId(int id) {

		return proRepo.findByCategoryId(id);
	}

}
