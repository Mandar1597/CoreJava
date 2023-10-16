package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
