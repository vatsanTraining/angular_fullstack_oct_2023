package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//findByPropName
	List<Product> findByProductName(String srchName);
	
	
	//@Query(value= "select * from dbs_product where rate_per_unit>:value" ,nativeQuery = true)
	@Query(value= "from Product where ratePerUnit>:value" ,nativeQuery = false)
	List<Product> getItemPriceGrtThan(@Param("value") double srchValue);
	
	 
}
