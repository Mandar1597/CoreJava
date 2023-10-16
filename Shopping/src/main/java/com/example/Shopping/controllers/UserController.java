package com.example.Shopping.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.example.Shopping.model.User;
import com.example.Shopping.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/NewUser")
	public User NewUser(@RequestBody User user ) {
		return userService.addNewUser(user);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user ) {
		return userService.updateUser(user);
	}
}
