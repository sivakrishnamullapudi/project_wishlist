package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Product;

public interface WishListProductRepository  extends JpaRepository<Product, Integer>{

	  

}
