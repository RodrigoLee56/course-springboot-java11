package com.hawkandwolf.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.coursejpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}