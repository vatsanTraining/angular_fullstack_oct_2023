package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.BookService;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class DoctorServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx=SpringApplication.run(DoctorServiceApplication.class, args);
	 
	   DoctorService service = ctx.getBean(DoctorService.class);
	
	     service.getDoctors().forEach(System.out::println);

	}

}
