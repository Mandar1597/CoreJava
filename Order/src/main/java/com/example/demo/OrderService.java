package com.example.demo;
import java.util.List;


import jakarta.persistence.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class OrderService 
{
	@Autowired
	private OrderRepository repo;
	
	
//	Retrieve all
	public List<Order> listAll()
	{
	return repo.findAll();
	}
	
//	create and update
	public void save(Order order)
	{
	repo.save(order);
	}
	
	
//	Retrieve single object
	public Order get(Integer id)
	{
	return repo.findById(id).get();
	}
	
//	delete
	public void delete(Integer id)
	{
	repo.deleteById(id);
	}

}
