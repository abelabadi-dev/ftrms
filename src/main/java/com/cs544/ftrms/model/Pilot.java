package com.cs544.ftrms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity @Inheritance(strategy=InheritanceType.JOINED)
public class Pilot extends Person {
	private String callSign;
	private String licenseNo;
	private String medicalLicenseNo;
	private Date medicalLicenseExpiryDate;

	public Pilot() {}

	public Pilot(String firstName, String lastName, String gender, int age, String nationality,String callSign, String licenseNo, String medicalLicenseNo, Date medicalLicenseExpiryDate) {
		super(firstName, lastName, gender, age, nationality);
		this.callSign = callSign;
		this.licenseNo = licenseNo;
		this.medicalLicenseNo = medicalLicenseNo;
		this.medicalLicenseExpiryDate = medicalLicenseExpiryDate;
	}

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
