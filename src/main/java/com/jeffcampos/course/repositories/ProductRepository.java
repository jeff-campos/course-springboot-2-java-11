package com.jeffcampos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffcampos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
