package com.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/")
	public String getAllProducts() {
		return "Getting All Products";
	}

}
