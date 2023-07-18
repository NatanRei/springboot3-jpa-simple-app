package com.ntnconsultoria.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntnconsultoria.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
