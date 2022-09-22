package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.User;
import com.test.repository.UserRepository;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> listAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User listById(int id) {
		
		return userRepo.findOne(id);
	}

	@Override
	public User create(User u) {
		
		return userRepo.save(u);
	}

	@Override
	public User edit(User u) {
		
		return userRepo.save(u);
	}

	@Override
	public User delete(int id) {
		
		User u = userRepo.findOne(id);
		if(u!=null) {
			userRepo.delete(u);
		}
		
		return u;
	}

	@Override
	public User findByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}

}
