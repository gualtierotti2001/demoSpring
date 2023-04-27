package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = ("${spring.env.frontend}"))
public class DemoClass {

	
	@GetMapping("/hello")
	String helloWord() {	
		return "hello";
	}
	
}

