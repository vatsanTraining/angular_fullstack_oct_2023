
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.ifaces.DoctorRepository;

@Service
public class DoctorService {

	
	private DoctorRepository repo;
	
	

	@Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo = repo;
	}
	
	 
	 public List<Doctor>  getDoctors(){
		 
		 return this.repo.findAll();
	 }
	 
}
