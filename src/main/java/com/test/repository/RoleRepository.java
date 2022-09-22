package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.entities.Role;

public interface RoleRepository extends Repository<Role, String> {
	
	List<Role> findAll();

	Role save(Role role);

	@Query("Select role From Role role Where role.id=:id ")
	Role findOne(int id);

	void delete(Role role);
}
