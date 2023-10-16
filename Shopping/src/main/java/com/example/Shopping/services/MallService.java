package com.example.Shopping.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Shopping.model.Mall;
import com.example.Shopping.repos.IMallRepository;

@Service
@Transactional

public class MallService {
	@Autowired
	 private IMallRepository mallrepo;


	 public List<Mall> listAll()
	 {
	 return mallrepo.findAll();
	 }
	
	 public void save(Mall mall)
	 {
	 mallrepo.save(mall);
	 }
	 
	 public Mall get(Long id)
	 {
	 return mallrepo.findById(id).get();
	 }
	 
	 public void delete(Long id)
	 {
	 mallrepo.deleteById(id);
	 }

}
