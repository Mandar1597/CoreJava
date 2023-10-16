package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.Mall;

public interface IMallRepository extends JpaRepository<Mall, Long> {

}
