package com.test.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.User;
import com.test.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/register")
public class RegisterRestController {
	
	@Autowired
	UserService userSer;	
	
	@PostMapping
	public User create(@RequestBody User u) {
		
		return userSer.create(u);
	}
}
