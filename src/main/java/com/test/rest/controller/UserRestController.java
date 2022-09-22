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

import com.test.entities.User;
import com.test.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	UserService userSer;
	
	@GetMapping
	public List<User> list() {
		
		return userSer.listAll();
	}
	
	@PostMapping
	public User create(@RequestBody User u) {
		
		return userSer.create(u);
	}
	
	@GetMapping(path =  {"/{id}"})
	public User listById(@PathVariable("id") int id) {
		
		return userSer.listById(id);
	}
	
	@PutMapping(path =  {"/{id}"})
	public User update(@RequestBody User u, @PathVariable("id") int id) {
		
		u.setId(id);
		
		return userSer.edit(u);
	}
	
	@DeleteMapping(path =  {"/{id}"})
	public User delete(@PathVariable("id") int id) {
		
		return userSer.delete(id);
	}

}
