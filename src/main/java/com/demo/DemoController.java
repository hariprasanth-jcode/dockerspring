package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/hi")
	public String getHi() {
		return "hi";
	}
	
	 @GetMapping("/")
	    public String home() {
	        return "home";  // Thymeleaf template name (home.html)
	    }
}
