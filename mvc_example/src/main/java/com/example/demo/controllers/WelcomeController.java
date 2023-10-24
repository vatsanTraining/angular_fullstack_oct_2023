package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping(path = "/welcome" , method = RequestMethod.GET)
	@ResponseBody
	public String getTitle() {
		
		return "<h1 style='text-align:center'>Welcome to Spring MVC ! </h1>";
	}
}
