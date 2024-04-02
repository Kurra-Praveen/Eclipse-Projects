package com.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Get HTTP Method
	// http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello world";
	}
	
	
	
}
