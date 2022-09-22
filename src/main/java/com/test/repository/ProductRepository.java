package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.Product;

public interface ProductRepository extends Repository<Product, Integer> {
	
	List<Product> findAll();

	Product save(Product pro);

	@Query("Select pro From Product pro Where pro.id=:id ")
	Product findOne(int id);

	void delete(Product pro);
	
	@Query("select p from Product p where p.category_id.id=?1 ")
	List<Product> findByCategoryId(int id);
}
