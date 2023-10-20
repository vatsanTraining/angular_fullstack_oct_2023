package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.training.ifaces.CrudRepository;
@Service
public class VendorService<Vendor> {


	private CrudRepository<Vendor> poly;

	public VendorService(@Qualifier("vendorFileImpl") CrudRepository<Vendor> poly) {
		super();
		this.poly = poly;
	}
	
	
	public boolean add(Vendor entity) {
		
		//return this.add(entity);
		return this.poly.add(entity);
		
	}
	
	public List<Vendor> findAll(){
		
		return this.poly.findAll();
	}
}
