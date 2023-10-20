package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendor ram = new Vendor();
		
		
		
		try {
			ram.setAge(220);
		} catch (RangeCheckException e) {
			System.err.println(e.getMessage());
		}
	
		System.out.println(ram.getAge());
		
		
		Vendor shyam = new Vendor(102,34);
		
		System.out.println(shyam);
	}

}
