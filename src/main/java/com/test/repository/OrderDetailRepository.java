package com.test.repository;

import java.util.List;

import com.test.entities.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.OrderDetail;

public interface OrderDetailRepository extends Repository<OrderDetail, Integer> {

	List<OrderDetail> findAll();

	OrderDetail save(OrderDetail orderDetail);

}
