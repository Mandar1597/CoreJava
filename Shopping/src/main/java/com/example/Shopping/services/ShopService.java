package com.example.Shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Shopping.model.Shop;
import com.example.Shopping.repos.ShopRepository;



public class ShopService {

	@Autowired
	 private ShopRepository shoprepo;


	 public List<Shop> listAll()
	 {
	 return shoprepo.findAll();
	 }
	
	 public void save(Shop shop)
	 {
	 shoprepo.save(shop);
	 }
	 
	 public Shop get(Integer id)
	 {
	 return shoprepo.findById(id).get();
	 }
	 
	 public void delete(Integer id)
	 {
	 shoprepo.deleteById(id);
	 }

	
}
