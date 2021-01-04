package com.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}