package com.deveduardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveduardo.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
