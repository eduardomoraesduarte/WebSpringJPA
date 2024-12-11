package com.deveduardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveduardo.config.TestConfig;
import com.deveduardo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	TestConfig 
	
}
