package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.Category;

public interface CategoryRepository extends Repository<Category, Integer> {

	List<Category> findAll();

	Category save(Category cate);

	@Query("Select cate From Category cate Where cate.id=:id ")
	Category findOne(int id);

	void delete(Category cate);

}
