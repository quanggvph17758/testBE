package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.OrderDetail;

public interface OrderDetailRepository extends Repository<OrderDetail, Integer> {

	OrderDetail save(OrderDetail orderDetail);

	@Query("Select orderDe From OrderDetail orderDe Where upper(orderDe.order_id) like upper(?1) ")
	List<OrderDetail> findOne(int id);

}
