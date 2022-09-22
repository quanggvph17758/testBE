package com.test.service.impl;

import java.util.List;

import com.test.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.OrderDetail;
import com.test.repository.OrderDetailRepository;
import com.test.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDeRepo;

	@Override
	public List<OrderDetail> listAll() {

		return orderDeRepo.findAll();
	}

	@Override
	public OrderDetail create(OrderDetail orderDetail) {

		return orderDeRepo.save(orderDetail);
	}

}
