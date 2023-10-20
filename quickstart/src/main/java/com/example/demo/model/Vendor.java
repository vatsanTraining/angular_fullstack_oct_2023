package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class Vendor {

 	int vendorId;
	String vendorName;
	String serviceType;
	long phoneNumber;
	String url;

	public String toString() {
		
		return this.vendorId+","+this.vendorName+","+this.serviceType+","+this.phoneNumber+","+this.url;
	}
}
