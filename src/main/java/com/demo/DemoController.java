package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	DemoService demoservice;
	
	@GetMapping("/hi")
	public String getHello() {
		return "redirect:/swagger-ui/index.html";
	}
	
	@GetMapping("/")
	public String getHi() {
		return demoservice.getAll().toString();
	}
	
	 @GetMapping("/hello")
	    public String home() {
	        return "hello";  
	    }
	 
	 @GetMapping("/email/{email}")
	 public Employee getEmployee(@PathVariable String email) {
		 return demoservice.getEmail(email);
	 }
}
