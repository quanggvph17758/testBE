package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.Order;

public interface OrderRepository extends Repository<Order, Integer> {
	
	List<Order> findAll();

	Order save(Order order);

	@Query("Select order From Order order Where order.id=:id ")
	Order findOne(int id);

	void delete(Order order);

}
