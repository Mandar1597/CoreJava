package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
