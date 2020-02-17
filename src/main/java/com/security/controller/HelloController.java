package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "<h3>Welcome to Spring Security</h3>";
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "<h3>Welcome to Student Page</h3>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h3>Welcome to Admin Page</h3>";
	}
	
}
