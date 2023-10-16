package com.example.Shopping.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping.model.OrderDetails;
import com.example.Shopping.services.OrderDetailsService;

@RestController
public class OrderDetailsController {

	@Autowired
	OrderDetailsService orderdetailsService;
	
	@GetMapping("/getOrderDetails")
	 public List<OrderDetails> list()
	 {
	 return orderdetailsService.listAll();
	 }
	
	@PutMapping("/updateOrderDetails/{id}")
	 public ResponseEntity<?> update(@RequestBody OrderDetails orderdetails, @PathVariable Integer id)
	 {
	 try
	 {
	 OrderDetails existOrderDetails = orderdetailsService.get(id);
	 orderdetailsService.save(orderdetails);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	
	@PostMapping("/addOrderDetails")
	 public void add(@RequestBody OrderDetails orderdetails)
	 {
	 orderdetailsService.save(orderdetails);
	 }
	
	@DeleteMapping("/removeOrderDetails/{id}")
	 public void delete(@PathVariable Integer id)
	 {
	 orderdetailsService.delete(id);
	 }
	
}
