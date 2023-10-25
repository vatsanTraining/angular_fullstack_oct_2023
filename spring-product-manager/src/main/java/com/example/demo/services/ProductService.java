package com.example.demo.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

	
	private ProductRepository repo;
	
	
	public Product findById(int id) {
		
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException("Element with Given Id Not Found"));
	}
	
	public List<Product> findAll(){
		
		return this.repo.findAll();
	}
	
	public Product add(Product entity) {
		
		return this.repo.save(entity);
	}
	
	public Product update(Product entity) {
		
		
		return this.repo.save(entity);
	}
	
	public Optional<Product> remove(Product entity) {
		
		   Optional<Product> optional = Optional.empty();

		   if(this.repo.existsById(entity.getId())) {

		   this.repo.delete(entity);
		   
		   optional= Optional.of(entity);

		   }

		         return optional;  

		
		
	}
	
	public List<Product> findByProductName(String prdName){
		
		return this.repo.findByProductName(prdName);
	}
	
	public List<Product> findByRatePerUnitGrt(double value){
		
		return this.repo.getItemPriceGrtThan(value);
	}
}
