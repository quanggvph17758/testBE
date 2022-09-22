package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Product;
import com.test.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	ProductService proSer;
	
	@GetMapping
	public List<Product> list() {
		
		return proSer.listAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product pro) {
		
		return proSer.create(pro);
	}
	
	@GetMapping(path = {"/{id}"})
	public Product listById(@PathVariable("id") int id) {
		
		return proSer.listById(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Product update(@RequestBody Product pro, @PathVariable("id") int id) {
		
		pro.setId(id);
		
		return proSer.edit(pro);
	}
	
	@DeleteMapping(path =  {"/{id}"})
	public Product delete(@PathVariable("id") int id) {
		
		return proSer.delete(id);
	}
}
