package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundoControler {
	
	@GetMapping("/hola")
	public String Index() {
		return "Hola Mundo!";
	}
}
