package com.example.Shopping.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Shopping.model.ShopOwner;
import com.example.Shopping.repos.ShopOwnerRepository;

public class ShopOwnerService {

	@Autowired
	 private ShopOwnerRepository shopownerrepo;


	 public List<ShopOwner> listAll()
	 {
	 return shopownerrepo.findAll();
	 }
	
	 public void save(ShopOwner shopowner)
	 {
	 shopownerrepo.save(shopowner);
	 }
	 
	 public ShopOwner get(Integer id)
	 {
	 return shopownerrepo.findById(id).get();
	 }
	 
	 public void delete(Integer id)
	 {
	 shopownerrepo.deleteById(id);
	 }
	
}
