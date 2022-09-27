package com.test.service;

import java.util.List;

import com.test.entities.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> listById(int id);

	OrderDetail create(OrderDetail orderDetail);

}
