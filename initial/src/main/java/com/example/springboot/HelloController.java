package com.example.springboot;

import com.example.springboot.bean.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private CustomService customService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!" + customService.getServiceName();
	}

}
