package com.jeffcampos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffcampos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
