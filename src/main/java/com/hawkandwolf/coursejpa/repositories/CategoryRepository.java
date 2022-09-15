package com.hawkandwolf.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.coursejpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
