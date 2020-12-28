package com.igraffe.onboardingdoctorservice.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.igraffe.onboardingdoctorservice.entity.DoctorRegistration;

public interface DoctorRegistrationService {
	
	public DoctorRegistration addDoctorRegistrations(@RequestBody DoctorRegistration doctorRegistration);
	
	public List<DoctorRegistration> listDoctorRegistrations();
	
	public DoctorRegistration getDoctorRegistration(@PathVariable long mobileNumber);

}
