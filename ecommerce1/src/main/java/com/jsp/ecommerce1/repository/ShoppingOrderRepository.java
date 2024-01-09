package com.jsp.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce1.dto.Customer;
import com.jsp.ecommerce1.dto.ShoppingOrder;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {

	List<ShoppingOrder> findByCustomer(Customer customer);

}