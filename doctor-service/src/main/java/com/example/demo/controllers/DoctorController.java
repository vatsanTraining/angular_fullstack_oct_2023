package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@RestController
@RequestMapping(path = "/api/v1/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {


	private DoctorService service;
	
	
	// eventhough we don't add @Autowired the Constructor DI takes place
	public DoctorController(DoctorService service) {
		super();
		this.service = service;
	}



	@GetMapping
	public List<Doctor> findAll(){
		
		 return this.service.getDoctors();
	}
	
	
}
