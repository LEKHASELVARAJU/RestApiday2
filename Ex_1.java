package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex_1 {
	@Value("${nam}")
	private String name;
	@GetMapping("name")
	public String display()
	{
		return "My name is "+name;
	}

}
