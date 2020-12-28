package com.igraffe.onboardingdoctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igraffe.onboardingdoctorservice.entity.DoctorRegistration;

@Repository
public interface DoctorRegistrationRepository extends 
MongoRepository<DoctorRegistration, Long>{

}
