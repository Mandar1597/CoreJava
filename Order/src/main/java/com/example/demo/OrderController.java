package com.example.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderController 
{
	@Autowired
	private OrderService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/Orders")
	
//	retrieve all
	public List<Order> list()
	{
	return service.listAll();
	}
	
//	RESTFUL API METHODS FOR RETRIEVE SINGLE OPERATION
	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> get(@PathVariable Integer id)
	{
	try
	{
	Order order = service.get(id);
	return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
			
	}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/addorders")
	public void add(@RequestBody Order order)
	{
	service.save(order);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/orders/{id}")
	public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id)
	{
	try
	{
//	Order existOrder = service.get(id);
	service.save(order);
	return new ResponseEntity<>(HttpStatus.OK);
			
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}

}
