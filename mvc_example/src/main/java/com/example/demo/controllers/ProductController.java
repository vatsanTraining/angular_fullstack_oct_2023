package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Doctor;
import com.example.demo.model.Product;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ProductController {

      private Product product;
	
	  private RestTemplate template;
  
	
	
	@RequestMapping(path="/product", method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", product);
		return "addproduct";
	}
	
	@RequestMapping(path="/product", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("product") Product product) {
		
		
		System.out.println("Now:="+product);
		
		
		template.postForEntity("http://localhost:8080/api/v1/products", product, Product.class);
		return "success";
	}

}
