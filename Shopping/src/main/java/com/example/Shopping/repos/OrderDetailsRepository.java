package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
