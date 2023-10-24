package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Doctor;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor

public class DoctorController {

	
	private Doctor doctor;
	
	
	@RequestMapping(path = "/")
	public String indexPage() {
		
		return "index";
	}
	
	@RequestMapping(path="/doctor", method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", doctor);
		System.out.println("Then:="+ doctor);
		return "adddoctor";
	}
	
	@RequestMapping(path="/doctor", method = RequestMethod.POST)
	public String submitForm(Doctor doctor) {
		
		System.out.println("Now:="+doctor);
		
		return "success";
	}
	
}
