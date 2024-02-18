package com.hexaware.springoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/")
	public String sayHello() {
		
		return "Hello Friends";
	}
	
	@GetMapping("/secure")
	public String secureResource() {
		
		return "This is secured resource,access using app login/github login credentials";
	}
	
}
