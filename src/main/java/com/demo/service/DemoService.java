package com.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.demo.entity.Employee;

@Service
public class DemoService {

	static Map<String,Employee> map=new HashMap();
	
	static {
		Employee e1=new Employee("vinay@gmail.com","Vinay");
		map.put(e1.getEmail(),e1);
		Employee e2=new Employee("tushar@gmail.com","Tushar");
		map.put(e2.getEmail(), e2);
	}
	
	public Employee getEmail(String email) {
		return map.get(email);
	}
	
	public Map<String,Employee> getAll() {
		return map;
	}
}
