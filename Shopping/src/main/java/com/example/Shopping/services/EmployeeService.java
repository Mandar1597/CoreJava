package com.example.Shopping.services;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Shopping.model.Employee;
import com.example.Shopping.repos.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	 private EmployeeRepository employeerepo;


	 public List<Employee> listAll()
	 {
	 return employeerepo.findAll();
	 }
	
	 public void save(Employee employee)
	 {
	 employeerepo.save(employee);
	 }
	 
	 public Employee get(Integer id)
	 {
	 return employeerepo.findById(id).get();
	 }
	 
	 public void delete(Integer id)
	 {
	 employeerepo.deleteById(id);
	 }
	
	
}
