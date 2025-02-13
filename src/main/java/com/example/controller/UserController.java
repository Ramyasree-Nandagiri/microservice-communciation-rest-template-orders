package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {
	
	
//	public 
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String greet() {
		
		String repo=restTemplate.getForObject("http://localhost:7090/getGreet", String.class);
		return repo;
		
	}

}
