package com.example.Shopping.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Shopping.model.Shop;
import com.example.Shopping.repos.ShopRepository;

@RestController
public class ShopController {
	
	@Autowired
	ShopRepository shopRepo;
	
	@GetMapping("/get")
	public List<Shop> listAll()
	 {
		 
			return shopRepo.findAll();
	 }
	
	
	@PostMapping("/addShop")
	public Shop addShop(@RequestBody Shop shop) {
		return shopRepo.save(shop);
	}
	
	@PutMapping("/updateShop/{shopId}")
	public Shop updateShop(@RequestBody Shop shop) {
		return shopRepo.save(shop);
	}

	@DeleteMapping("/removeShop/{shopId}")
	 public void deleteById(@PathVariable Shop shopId)
	 {
	 shopRepo.delete(shopId);
	 }
}