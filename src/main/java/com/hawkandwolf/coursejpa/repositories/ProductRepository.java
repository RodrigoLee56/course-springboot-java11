package com.hawkandwolf.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.coursejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
