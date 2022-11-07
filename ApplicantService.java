package com.example.demo.service;

import com.example.demo.entity.Applicant;

public interface ApplicantService {
	
	public abstract String addApplicant(Applicant applicant);
	public abstract String updateApplicant(Applicant applicant);
	public abstract String deleteApplicant(String firstName);
	public abstract Applicant getApplicant(String firstName);

}
