package com.example.demo.excetions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException  {

	
	private String errorCode;
	private String description;
	private LocalDateTime dateTime;
	
}
