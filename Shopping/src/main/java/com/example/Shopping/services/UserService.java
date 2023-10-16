package com.example.Shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shopping.model.User;
import com.example.Shopping.repos.IUserRepository;

@Service 
public class UserService {
	
	@Autowired
	IUserRepository userRepo;
	
	public User addNewUser(User user)
	{
		userRepo.save(user);
		return user; 
	}
	
	public User updateUser(User user) {
		userRepo.save(user);
		return user;
	}
	
}
