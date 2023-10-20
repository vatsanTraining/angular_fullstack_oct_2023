package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="doctor")
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;
}
