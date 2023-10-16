package com.example.Shopping.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping.model.Mall;
import com.example.Shopping.services.MallService;


@RestController
public class MallController {
	
	@Autowired
	MallService mallService;
	
	@GetMapping("/getMall")
	 public List<Mall> list()
	 {
	 return mallService.listAll();
	 }
	
	@PutMapping("/updateMall/{id}")
	 public ResponseEntity<?> update(@RequestBody Mall mall, @PathVariable Long id)
	 {
	 try
	 {
	 Mall existMall = mallService.get(id);
	 mallService.save(mall);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	
	@PostMapping("/addMall")
	 public void add(@RequestBody Mall mall)
	 {
	 mallService.save(mall);
	 }
	
	@DeleteMapping("/removeMall/{id}")
	 public void delete(@PathVariable Long id)
	 {
	 mallService.delete(id);
	 }
}

