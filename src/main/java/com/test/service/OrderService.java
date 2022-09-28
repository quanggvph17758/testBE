package com.test.service;

import java.util.List;

import com.test.entities.Order;

public interface OrderService {
	
	List<Order> listAll();
	
	Order listById(int id);
	
	Order create(Order order);
	
	Order edit(Order order);
	
	Order delete(int id);

	List<Order> findByUserId(int uid);
	
}
