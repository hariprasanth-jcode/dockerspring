package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/hi")
	public String getHi() {
		return "hi";
	}
}
