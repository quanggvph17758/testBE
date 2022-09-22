package com.test.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.User;
import com.test.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginRestController {
	
	@Autowired
	UserService userSer;

	
	@PostMapping
	public ResponseEntity<?> login(@RequestBody User u) {
		
		User user = userSer.findByEmail(u.getEmail());
		if (user.getPassword().equals(u.getPassword())) {
			return ResponseEntity.ok(user);
		}
			
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
}
