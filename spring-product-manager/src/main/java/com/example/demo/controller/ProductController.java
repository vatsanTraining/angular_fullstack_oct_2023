package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

import lombok.AllArgsConstructor;

@RestController

@AllArgsConstructor

@RequestMapping(path = "/api/v1/products")
@CrossOrigin(origins = "*")
public class ProductController {

	
	private ProductService service;
	
	
	@GetMapping
	public List<Product> getAll(){
		
		return this.service.findAll();
		
	}
	
	@GetMapping(path = "/{id}")
	public Product findById(@PathVariable int id){
		
		return this.service.findById(id);
		
	}
	
	@GetMapping(path = "/srch/name/{prdName}")
	public List<Product> findByProductName(@PathVariable String prdName){
		
		return this.service.findByProductName(prdName);
		
	}
	
	@GetMapping(path = "/srch/rpu/{rpu}")
	public List<Product> findByRatePerUnitGtThan(@PathVariable("rpu") double value){
		
		return this.service.findByRatePerUnitGrt(value);
		
	}
	
	
	@PostMapping
	public ResponseEntity<Product> save(@RequestBody Product entity) throws URISyntaxException{
		
		Product added = this.service.add(entity);

		return ResponseEntity.created(new URI("/api/v1/products/"+entity.getId())).body(added);
	}
	
	@PutMapping
	public ResponseEntity<Product> update(@RequestBody Product entity) {
		
		Product added = this.service.add(entity);

		return ResponseEntity.ok().body(added);
	}
	

	@DeleteMapping
	public ResponseEntity<Product> remove(@RequestBody Product entity) {
		
		Product deleted = this.service.remove(entity).orElseThrow(() -> new RuntimeException("Element Not Found"));

		return ResponseEntity.ok().body(deleted);
	}

}
