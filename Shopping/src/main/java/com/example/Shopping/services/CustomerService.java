package com.example.Shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Shopping.model.Customer;
import com.example.Shopping.repos.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	 private CustomerRepository customerrepo;


	 public List<Customer> listAll()
	 {
	 return customerrepo.findAll();
	 }
	
	 public void save(Customer customer)
	 {
	 customerrepo.save(customer);
	 }
	 
	 public Customer get(Long id)
	 {
	 return customerrepo.findById(id).get();
	 }
	 
	 public void delete(Long id)
	 {
	 customerrepo.deleteById(id);
	 }
	
}
