package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Order;
import com.test.repository.OrderRepository;
import com.test.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepo;

	@Override
	public List<Order> listAll() {

		return orderRepo.findAll();
	}

	@Override
	public Order listById(int id) {

		return orderRepo.findOne(id);
	}

	@Override
	public Order create(Order order) {

		return orderRepo.save(order);
	}

	@Override
	public Order edit(Order order) {

		return orderRepo.save(order);
	}

	@Override
	public Order delete(int id) {

		Order o = orderRepo.findOne(id);

		if (o != null) {
			orderRepo.delete(o);
		}

		return o;
	}
}
