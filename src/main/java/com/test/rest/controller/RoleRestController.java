package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Role;
import com.test.service.RoleService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/role")
public class RoleRestController {
	
	@Autowired
	RoleService roleSer;
	
	@GetMapping
	public List<Role> list() {
		
		return roleSer.listAll();
	}
}
