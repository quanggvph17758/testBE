package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Order;
import com.test.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	OrderService orderSer;
	
	@GetMapping
	public List<Order> list() {
		
		return orderSer.listAll();
	}
	
	@PostMapping
	public Order create(@RequestBody Order order) {
		
		return orderSer.create(order);
	}
	
	@GetMapping(path =  {"/{id}"})
	public Order listById(@PathVariable("id") int id) {

		return orderSer.listById(id);
	}
	
	@PutMapping(path =  {"/{id}"})
	public Order update(@RequestBody Order order, @PathVariable("id") int id) {
		
		order.setId(id);
		
		return orderSer.edit(order);
	}
}
