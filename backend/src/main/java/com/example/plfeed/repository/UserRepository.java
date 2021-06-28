package com.example.plfeed.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.plfeed.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	List<User> findByNameAndEmail(String name, String email);
	
}
