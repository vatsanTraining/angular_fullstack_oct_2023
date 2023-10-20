package com.training.service;

import java.util.List;

import com.training.ifaces.CrudRepository;

public class VendorService<Vendor> {


	private CrudRepository<Vendor> poly;

	public VendorService(CrudRepository<Vendor> poly) {
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
