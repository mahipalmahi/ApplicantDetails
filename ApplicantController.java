package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Applicant;
import com.example.demo.service.ApplicantService;



@RestController
@RequestMapping("/applicant") // http://localhost:3331/applicant

public class ApplicantController {
	@Autowired
	ApplicantService service;
	@PostMapping("/addapplicant")//http://localhost:3331/applicant/addapplicant
	public String insertApplicant(@RequestBody Applicant applicant) {
		return service.addApplicant(applicant);
	}
@PutMapping("/updateapplicant")//http://localhost:3331/applicant/updateapplicant
public String updateApplicant(@RequestBody Applicant applicant) {
	return service.updateApplicant(applicant);
}
@DeleteMapping("/deleteapplicant/{fname}")//http://localhost:3331/applicant/deleteapplicant
public String deleteApplicant(@PathVariable("fname") String firstName) {
	return service.deleteApplicant(firstName);
}
@GetMapping("/getapplicant/{fname}")//http://localhost:3331/applicant/geteapplicant
public  Applicant getApplicant(@PathVariable("fname") String firstName){
	
return service.getApplicant(firstName);
}
}

