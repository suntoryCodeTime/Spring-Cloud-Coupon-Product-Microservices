package com.suntorycodetime.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntorycodetime.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	Product findByName(String name);

}
