package com.igraffe.onboardingdoctorservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.igraffe.onboardingdoctorservice.entity.DoctorRegistration;
import com.igraffe.onboardingdoctorservice.repository.DoctorRegistrationRepository;
import com.igraffe.onboardingdoctorservice.service.DoctorRegistrationService;
@Service
public class DoctorRegistrationServiceImpl implements DoctorRegistrationService{

	private DoctorRegistrationRepository doctorRegistrationRepository;
	
	
	
	public DoctorRegistrationServiceImpl(DoctorRegistrationRepository doctorRegistrationRepository) {
		this.doctorRegistrationRepository = doctorRegistrationRepository;
	}

	@Override
	public DoctorRegistration addDoctorRegistrations(DoctorRegistration doctorRegistration) {
		// TODO Auto-generated method stub
		return doctorRegistrationRepository.save(doctorRegistration);
	}

	@Override
	public List<DoctorRegistration> listDoctorRegistrations() {
		// TODO Auto-generated method stub
		return doctorRegistrationRepository.findAll();
	}

	@Override
	public DoctorRegistration getDoctorRegistration(long mobileNumber) {
		Optional<DoctorRegistration> doctorRegistration = doctorRegistrationRepository.findById(mobileNumber);
		System.out.println("doc "+doctorRegistration);
		return doctorRegistration.get();
	}

}
