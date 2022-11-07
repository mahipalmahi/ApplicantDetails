package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applicant")
public class Applicant {
	
	@Id
	private int ApplicantId;
	@Column(length=15)
	private String firstName;
	private String Lastname;
	private String emailId;
	private String password;
	private String confirmpassword;
	private long phoneNo;
	private String nationality;
	private String state;
	private String Address;
	public int getApplicantId() {
		return ApplicantId;
	}
	public void setApplicantId(int applicantId) {
		ApplicantId = applicantId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Applicant(int applicantId, String firstName, String lastname, String emailId, String password,
			String confirmpassword, long phoneNo, String nationality, String state, String address) {
		super();
		ApplicantId = applicantId;
		this.firstName = firstName;
		Lastname = lastname;
		this.emailId = emailId;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.phoneNo = phoneNo;
		this.nationality = nationality;
		this.state = state;
		Address = address;
	}
	@Override
	public String toString() {
		return "Applicant [ApplicantId=" + ApplicantId + ", firstName=" + firstName + ", Lastname=" + Lastname
				+ ", emailId=" + emailId + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ ", phoneNo=" + phoneNo + ", nationality=" + nationality + ", state=" + state + ", Address=" + Address
				+ "]";
	}

}
