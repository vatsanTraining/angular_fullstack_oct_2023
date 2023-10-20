package com.training;

import java.time.LocalDateTime;

import com.training.exceptions.RangeCheckException;

public class Vendor {

	private int id;
	private int age;
	
	Object obj;
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws RangeCheckException {
		if(age <1 || age >120) {
			
			 
			throw new RangeCheckException("ERR-101","Enter the Age between 1 to 120",LocalDateTime.now());
		} else {
		this.age = age;
		}
	}

	@Override
	public String toString() {
		return this.id+","+this.age;
	}
	
	
}
