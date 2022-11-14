package com.cgi.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.restapi.model.Product;

@RestController
public class ProductController {

	
	@GetMapping(path="message",produces = {"text/plan"})
	public ResponseEntity<String> message() {
		ResponseEntity<String> res=
				new ResponseEntity<String>("HELLO", HttpStatus.OK);
		
		return res;
		
	}
	
	@GetMapping(path ="product",produces = {"application/json"})
	public ResponseEntity<Product> getProduct(){
		Product product=new Product(1001, "Mobile", 30000);
		ResponseEntity<Product> res=
				new ResponseEntity<Product>(product, HttpStatus.OK);
		
		return res;
	}
	
	@GetMapping(path ="productxml",produces =MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Product> getProduct1(){
		Product product=new Product(1001, "Mobile", 30000);
		ResponseEntity<Product> res=
				new ResponseEntity<Product>(product, HttpStatus.OK);
		
		return res;
	}
	
	@GetMapping(path ="products",produces = {"application/json"})
	public ResponseEntity<List<Product>> getAllProducts(){
		Product product1=new Product(1001, "Mobile", 30000);
		Product product2=new Product(1002, "Laptop", 70000);
		Product product3=new Product(1003, "Smart Watch", 5000);
		List<Product> list=new ArrayList<>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		
		ResponseEntity<List<Product>> res=
				new ResponseEntity<List<Product>>(list, HttpStatus.OK);
		
		return res;
	}
	
	
	
}

