package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "dbs_product")
@Entity

@Data
public class Product {

	
	 @Id
	 @Column(name = "id")
	 int id;
	 
	 
	 @Column(name = "product_name")
	 String productName;
	 
	 @Column(name = "rate_per_unit")
	 double ratePerUnit;
}

