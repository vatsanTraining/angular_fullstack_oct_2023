package com.training.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Vendor;
import com.training.ifaces.CrudRepository;

@Repository
public class VendorFileImpl implements CrudRepository<Vendor> {

	
	@Override
	public boolean add(Vendor vendor) {

		boolean result =true;
		PrintWriter writer=null;
		try {
			 writer = new PrintWriter(new FileWriter(new File("vendor.txt"), true));
			writer.println(vendor);
		} catch (IOException e) {
			
			result =false;
			e.printStackTrace();
		}finally {
			
			writer.close();
		}
		
		return result;
	}
	

	@Override
	public List<Vendor> findAll() {

		List<Vendor> vendorList = new ArrayList<>();
			
		try(BufferedReader reader = new BufferedReader(new FileReader(new File("vendor.txt")))){
			
			String line = null;
			
			while( (line=reader.readLine())!=null) {
				
				String values[] = line.split(",");
				
				int vendorId = Integer.parseInt(values[0]);
				String vendorName= values[1];
				String serviceType=values[2];
				long phoneNumber = Long.parseLong(values[3]);
				String url = values[4];
				
				
				Vendor obj = new Vendor(vendorId, vendorName, serviceType, phoneNumber, url);
				
				vendorList.add(obj);
				
			}
			 
			 		 
		}catch(IOException e ) {
			
			e.printStackTrace();
		}
		
		 
		
		return vendorList;
	}

}
