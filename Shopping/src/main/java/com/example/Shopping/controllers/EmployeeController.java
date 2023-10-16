package com.example.Shopping.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping.model.Employee;
import com.example.Shopping.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmployee")
	 public List<Employee> list()
	 {
	 return employeeService.listAll();
	 }
	
	@PutMapping("/updateEmployee/{id}")
	 public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer id)
	 {
	 try
	 {
	 Employee existEmployee = employeeService.get(id);
	 employeeService.save(employee);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	
	@PostMapping("/addEmployee")
	 public void add(@RequestBody Employee employee)
	 {
	 employeeService.save(employee);
	 }
	
	@DeleteMapping("/removeEmployee/{id}")
	 public void delete(@PathVariable Integer id)
	 {
	 employeeService.delete(id);
	 }
}
