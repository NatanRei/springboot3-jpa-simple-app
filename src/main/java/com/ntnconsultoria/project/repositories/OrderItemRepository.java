package com.ntnconsultoria.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntnconsultoria.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
