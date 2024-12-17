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
	String hello() {
		return "hello world   CI / CD created by khaled and belgacem ";
	}

	@GetMapping("/api/v1")
	String  getProducts() {
		 Product product = new Product("Product Name" , 1000D , 1000D);
		 return  product.toString();
	}
}
