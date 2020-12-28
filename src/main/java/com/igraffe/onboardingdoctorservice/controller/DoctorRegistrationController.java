package com.igraffe.onboardingdoctorservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igraffe.onboardingdoctorservice.entity.DoctorRegistration;
import com.igraffe.onboardingdoctorservice.service.DoctorRegistrationService;

@RestController
@RequestMapping("/doctorRegistration")
public class DoctorRegistrationController {
	
	private DoctorRegistrationService doctorRegistrationService;

	public DoctorRegistrationController(DoctorRegistrationService doctorRegistrationService) {
		this.doctorRegistrationService = doctorRegistrationService;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public DoctorRegistration addDoctorRegistrations(@RequestBody DoctorRegistration doctorRegistration) {
		return doctorRegistrationService.addDoctorRegistrations(doctorRegistration);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<DoctorRegistration> listDoctorRegistrations() {
		return doctorRegistrationService.listDoctorRegistrations();
	}
	
	@RequestMapping(value = "/{mobileNumber}", method = RequestMethod.GET)
	public DoctorRegistration getDoctorRegistration(@PathVariable long mobileNumber) {
		return doctorRegistrationService.getDoctorRegistration(mobileNumber);
	}
}
