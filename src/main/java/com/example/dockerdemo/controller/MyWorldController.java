package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myWorld")
public class MyWorldController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("Hello World");
		return "Hello World";
	}
}
