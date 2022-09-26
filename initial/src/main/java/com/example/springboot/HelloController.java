package com.example.springboot;

import com.example.springboot.services.MetricsExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	MetricsExporter metricsExporter;

	@GetMapping("/")
	public String index() {
		metricsExporter.updateAllClusterStatus();
		return "Greetings from Spring Boot!";
	}

}
