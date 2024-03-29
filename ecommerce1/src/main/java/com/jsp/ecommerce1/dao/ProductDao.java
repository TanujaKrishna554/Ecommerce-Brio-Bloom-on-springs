package com.jsp.ecommerce1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.ecommerce1.dto.Item;
import com.jsp.ecommerce1.dto.Product;
import com.jsp.ecommerce1.repository.ItemRepository;
import com.jsp.ecommerce1.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ItemRepository itemRepository;
	public void save(Product product) {
		productRepository.save(product);
	}
	public List<Product> fetchAll() {
		return productRepository.findAll();
	}
	public Product findById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	public void delete(Product product) {
		productRepository.delete(product);
	}

	public List<Product> fetchDisplayProducts() {
		return productRepository.findByDisplayTrue();
	}
	public void deleteItem(Item item)
	{
		itemRepository.delete(item);
	}
	
	
	}
	

		
			
		
	
	

	
	
