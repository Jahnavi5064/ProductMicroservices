package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	ProductEntity findByEmail(String email);


}
