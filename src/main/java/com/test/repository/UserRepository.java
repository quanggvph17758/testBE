package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.User;

public interface UserRepository extends Repository<User, Integer> {
	
	List<User> findAll();
	
	User save(User u);

	@Query("Select u From User u Where u.id=:id ")
	User findOne(int id);

	
	void delete(User u);

	@Query("Select u From User u Where u.email=:email ")
	User findByEmail(String email);
	
}
