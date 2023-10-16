package com.example.Shopping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shopping.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
