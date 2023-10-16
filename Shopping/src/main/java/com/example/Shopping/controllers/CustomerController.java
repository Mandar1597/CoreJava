package com.example.Shopping.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping.model.Customer;
import com.example.Shopping.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getCustomer")
	 public List<Customer> list()
	 {
	 return customerService.listAll();
	 }
	
	@PutMapping("/updateCustomer/{id}")
	 public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Long id)
	 {
	 try
	 {
	 Customer existCustomer = customerService.get(id);
	 customerService.save(customer);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	
	@PostMapping("/addCustomer")
	 public void add(@RequestBody Customer customer)
	 {
	 customerService.save(customer);
	 }
	
	@DeleteMapping("/removeCustomer/{id}")
	 public void delete(@PathVariable Long id)
	 {
	 customerService.delete(id);
	 }
	
}
