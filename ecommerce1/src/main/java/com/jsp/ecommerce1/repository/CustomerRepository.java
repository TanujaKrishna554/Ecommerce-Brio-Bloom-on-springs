package com.jsp.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce1.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	List<Customer> findByEmailOrMobile(String email, long mobile);

}