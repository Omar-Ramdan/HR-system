package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.Service.UserService;

@RestController
public class Restcontroller {

	@Autowired
	private UserService userservice;


	
	@GetMapping("/save-user")
	public String saveUserData(@RequestParam String fristName,@RequestParam String lastName,@RequestParam String username,
			@RequestParam int phone,@RequestParam int age,@RequestParam String password) {
		
		User user = new User(fristName,lastName,username,phone,age,password);
		userservice.saveMyUser(user);
		return "user saved";
	}

}
