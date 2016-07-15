package com.mum.cs544.ftms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
//
//@Inheritance(strategy=InheritanceType.JOINED)
@Entity
public class Pilot extends Person {
	
	//@NotNull
	private String callSign;
	//@NotNull
	private String licenseNo;
	//@NotNull
	private String medicalLicenseNo;
	//@NotNull @Temporal(TemporalType.DATE)
	private Date medicalLicenseExpiryDate;

	public Pilot() {}

	/*public Pilot(String firstName, String lastName, String gender, int age,String nationality,String callSign, String licenseNo, String medicalLicenseNo, Date medicalLicenseExpiryDate) {
		super(firstName, lastName, gender, age, nationality);
		this.callSign = callSign;
		this.licenseNo = licenseNo;
		this.medicalLicenseNo = medicalLicenseNo;
		this.medicalLicenseExpiryDate = medicalLicenseExpiryDate;
	}*/


public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getMedicalLicenseNo() {
		return medicalLicenseNo;
	}

	public void setMedicalLicenseNo(String medicalLicenseNo) {
		this.medicalLicenseNo = medicalLicenseNo;
	}

	public Date getMedicalLicenseExpiryDate() {
		return medicalLicenseExpiryDate;
	}

	public void setMedicalLicenseExpiryDate(Date medicalLicenseExpiryDate) {
		this.medicalLicenseExpiryDate = medicalLicenseExpiryDate;
	}

}
