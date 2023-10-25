package com.example.demo.excetion.handler;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.excetions.CustomException;

@RestControllerAdvice
public class CustomExceptionHandler {

	
	@ExceptionHandler(value = RuntimeException.class)
	public CustomException handleRunTime(Exception ex , WebRequest req)  {
		
		return new CustomException("ERR-101",ex.getMessage(), LocalDateTime.now());
		
	}
}
