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

	@GetMapping("/jenkins")
	String jenkinsMessage(){
		return  "hello world  from jenkins !!!!";
	}

}
