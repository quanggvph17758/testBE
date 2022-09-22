package com.test.service;

import java.util.List;

import com.test.entities.Role;



public interface RoleService {

	List<Role> listAll();
	
	Role listById(int id);
	
	Role create(Role role);
	
	Role edit(Role role);
	
	Role delete(int id);
}
