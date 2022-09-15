package com.hawkandwolf.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hawkandwolf.coursejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// Só com está definição o nosso repositório já está pronto.
}