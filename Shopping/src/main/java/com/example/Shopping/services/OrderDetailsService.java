package com.example.Shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Shopping.model.OrderDetails;
import com.example.Shopping.repos.OrderDetailsRepository;

@Service
@Transactional
public class OrderDetailsService {

	@Autowired
	 private OrderDetailsRepository orderdetailsrepo;


	 public List<OrderDetails> listAll()
	 {
	 return orderdetailsrepo.findAll();
	 }
	
	 public void save(OrderDetails orderdetails)
	 {
	 orderdetailsrepo.save(orderdetails);
	 }
	 
	 public OrderDetails get(Integer id)
	 {
	 return orderdetailsrepo.findById(id).get();
	 }
	 
	 public void delete(Integer id)
	 {
	 orderdetailsrepo.deleteById(id);
	 }
	
}
