package com.igraffe.onboardingdoctorservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
//@Entity
//@Table(name = "doctor_registration")
@Data
@NoArgsConstructor
@Document(collection = "doctor_registration")
public class DoctorRegistration {
	
	@Id
	private long mobileNumber;

	private String name;

	private String gender;
	
	private int age;
	
	private String experience;
	
	private String emailId;
	
	private String category;
	
	private int practitionerId;
	
	private int specialistId;
	
	private int referralId;

	
}
