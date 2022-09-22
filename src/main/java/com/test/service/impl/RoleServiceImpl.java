package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Role;
import com.test.repository.RoleRepository;
import com.test.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepo;

	@Override
	public List<Role> listAll() {
		
		return roleRepo.findAll();
	}

	@Override
	public Role listById(int id) {
		
		return roleRepo.findOne(id);
	}

	@Override
	public Role create(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Role edit(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Role delete(int id) {
		
		Role role = roleRepo.findOne(id);
		
		if (role != null) {
			
			roleRepo.delete(role);
		}
		
		return role;
	}

}
