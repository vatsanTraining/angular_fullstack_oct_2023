package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class Product {

     int id;
	String productName;
	 
	double ratePerUnit;
}
