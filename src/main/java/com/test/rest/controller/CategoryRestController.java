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

import com.test.entities.Category;
import com.test.service.CategoryService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/category")
public class CategoryRestController {
	
	@Autowired
	CategoryService cateSer;
	
	@GetMapping
	public List<Category> list() {
		
		return cateSer.listAll();
	}
	
	@PostMapping
	public Category create(@RequestBody Category cate) {
		
		return cateSer.create(cate);
	}
	
	@GetMapping(path =  {"/{id}"})
	public Category listById(@PathVariable("id") int id) {
		
		return cateSer.listById(id);
	}
	
	@PutMapping(path =  {"/{id}"})
	public Category update(@RequestBody Category cate, @PathVariable("id") int id) {
		
		cate.setId(id);
		
		return cateSer.edit(cate);
	}
	
	@DeleteMapping(path =  {"/{id}"})
	public Category delete(@PathVariable("id") int id) {
		
		return cateSer.delete(id);
	}
}
