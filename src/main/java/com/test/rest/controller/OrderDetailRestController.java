package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.entities.OrderDetail;
import com.test.service.OrderDetailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailRestController {
	
	@Autowired
	OrderDetailService orderDeSer;
	
	@GetMapping
	public List<OrderDetail> list() {

		return orderDeSer.listAll();
	}

	@PostMapping
	public OrderDetail create(@RequestBody OrderDetail orderDetail) {

		return orderDeSer.create(orderDetail);
	}
}
