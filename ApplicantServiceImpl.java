package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ApplicantDao;
import com.example.demo.entity.Applicant;
@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	ApplicantDao dao;

	@Override
	public String addApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return dao.addApplicant(applicant);
	}

	@Override
	public String updateApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return dao.updateApplicant(applicant);
	}

	@Override
	public String deleteApplicant(String firstName) {
		// TODO Auto-generated method stub
		return dao.deleteApplicant(firstName);
	}

	@Override
	public Applicant getApplicant(String firstName) {
		// TODO Auto-generated method stub
		return dao.getApplicant(firstName);
	}

}
