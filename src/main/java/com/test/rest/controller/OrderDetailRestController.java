package com.test.rest.controller;

import java.util.List;

import com.test.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.entities.OrderDetail;
import com.test.service.OrderDetailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailRestController {
	
	@Autowired
	OrderDetailService orderDeSer;

	@PostMapping
	public OrderDetail create(@RequestBody OrderDetail orderDetail) {

		return orderDeSer.create(orderDetail);
	}

	@GetMapping(path =  {"/{id}"})
	public List<OrderDetail> listById(@PathVariable("id") int id) {

		return orderDeSer.listById(id);
	}
}
