package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entities.User;

public interface UserService {
	
	List<User> listAll();
	User listById(int id);
	User create(User u);
	User edit(User u);
	User delete(int id);
	User findByEmail(String email);
}
