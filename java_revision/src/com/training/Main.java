package com.training;

import com.training.ifaces.CrudRepository;
import com.training.impl.VendorFileImpl;
import com.training.impl.VendorInMemoryImpl;
import com.training.service.VendorService;

public class Main {

	public static CrudRepository<Vendor> factory(int key){
		
		switch (key) {
	
		case 1:
				return new VendorInMemoryImpl();
		case 2:
			return new VendorFileImpl();
		default:
			return null;
		}
		
	}
	
	public static void main(String[] args) {

		CrudRepository<Vendor> repo = factory(Integer.parseInt(args[0]));
		
		//CrudRepository<Vendor> repo = factory(2);

		 VendorService<Vendor> service = new VendorService<>(repo);
		 
		  System.out.println("Is Added:=>"+service.add(new Vendor(902,56)));  
		   
		  System.out.println("Is Added:=>"+service.add(new Vendor(904,36)));
		  
		         service.findAll().forEach(System.out::println);
		         

	}

}
