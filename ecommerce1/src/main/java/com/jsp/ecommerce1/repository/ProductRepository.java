package com.jsp.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce1.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	List<Product> findByDisplayTrue();
}