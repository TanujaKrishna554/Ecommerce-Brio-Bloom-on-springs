package com.jsp.ecommerce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce1.dto.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>
{

}