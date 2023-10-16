package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
