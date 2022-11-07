package com.example.demo.dao;

import com.example.demo.entity.Applicant;

public interface ApplicantDao {
	public abstract String addApplicant(Applicant applicant);
	public abstract String updateApplicant(Applicant applicant);
	public abstract String deleteApplicant(String firstName);
	public abstract Applicant getApplicant(String firstName);
	

}
