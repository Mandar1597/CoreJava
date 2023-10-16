package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.Item;


public interface IItemRepository extends JpaRepository<Item, Long> {

}
