package com.hawkandwolf.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.coursejpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
