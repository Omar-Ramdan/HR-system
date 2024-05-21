package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.Service.UserService;

@RestController
public class Restcontroller {

	@Autowired
	private UserService userservice;


	
	@GetMapping("/save-user")
	public String saveUserData(@RequestParam String fristName_en,@RequestParam String fristName_ar,@RequestParam String lastName_en
			,@RequestParam String lastName_ar,@RequestParam String username,@RequestParam int phone,@RequestParam int age,
			@RequestParam String password) {
		
		Users user = new Users(fristName_en,fristName_ar,lastName_en,lastName_ar,username,phone,age,password);
		userservice.saveMyUser(user);
		return "user saved";
	}

}
