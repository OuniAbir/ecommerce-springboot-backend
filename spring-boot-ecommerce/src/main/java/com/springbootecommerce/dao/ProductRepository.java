package com.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
