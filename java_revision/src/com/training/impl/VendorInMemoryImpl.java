package com.training.impl;

import java.util.ArrayList;
import java.util.List;

import com.training.Vendor;
import com.training.ifaces.CrudRepository;

public  class VendorInMemoryImpl implements CrudRepository<Vendor> {
	
	List<Vendor> vendorList ;
	

	public VendorInMemoryImpl() {
		super();
		
		this.vendorList=new ArrayList<>();
	}

	@Override
	public boolean add(Vendor vendor) {
		return this.vendorList.add(vendor);
	}

	@Override
	public List<Vendor> findAll() {
		return this.vendorList;
	}

}
