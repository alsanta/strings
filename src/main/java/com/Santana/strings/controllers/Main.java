package com.Santana.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	
	@RequestMapping("/")
	public String homepage() {
		return "Hi client! How are you doing this fine day?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to respond with strings";
	}
}
