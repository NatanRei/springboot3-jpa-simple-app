package com.ntnconsultoria.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntnconsultoria.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
