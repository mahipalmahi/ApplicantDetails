package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Applicant;

@Repository
@Transactional

public class ApplicantDaoImpl implements ApplicantDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public String addApplicant(Applicant applicant) {
		em.persist(applicant);
		return "Details added sucessfully";
	}

	@Override
	public String updateApplicant(Applicant applicant) {
		em.merge(applicant);
		return  "Details updated sucessfully";
	}

	@Override
	public String deleteApplicant(String firstName) {
		Applicant applicant=em.find(Applicant.class, firstName);
em.remove(applicant);
		return "Applicant details deleted sucessfully";
	}

	@Override
	public Applicant getApplicant(String firstName) {
		
		return em.find(Applicant.class, firstName);
		
	}

}
