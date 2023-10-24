package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorController {

	
	@RequestMapping(path = "/")
	public String indexPage() {
		
		return "index";
	}
}
