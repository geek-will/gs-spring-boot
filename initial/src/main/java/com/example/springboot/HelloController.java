package com.example.springboot;

import com.example.springboot.bean.CustomMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private CustomMetrics customMetrics;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!" + customMetrics.getCustomMetrics();
	}

}
