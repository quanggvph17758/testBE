package com.test.service;

import java.util.List;

import com.test.entities.OrderDetail;

public interface OrderDetailService {
	
	List<OrderDetail> listAll();

	OrderDetail create(OrderDetail orderDetail);
}
