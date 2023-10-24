package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

	int doctorId;
	
	String doctorName;
	
		String department;

}
