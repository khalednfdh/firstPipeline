package com.org.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPipelineApplication.class, args);
	}

	@GetMapping("/hello")
	String jenkinsMessage() {
		return "hello world   CI / CD created by khaled and belgacem ";
	}

	@GetMapping("/test")
	String test() {
		return "hello world   CI / CD created by khaled and belgacem ";
	}
}
