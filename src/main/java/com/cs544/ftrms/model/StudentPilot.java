package com.cs544.ftrms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentPilot extends Pilot {
	@Id @GeneratedValue
	private int id;
	private String trainingType;
	private String batch;
	private String status;

	public StudentPilot() {
	}

	public StudentPilot(String firstName, String lastName, String gender, int age, String nationality,String callSign, String licenseNo, String medicalLicenseNo, Date medicalLicenseExpiryDate,String trainingType, String batch, String status) {
		super(firstName, lastName, gender, age, nationality,callSign, licenseNo, medicalLicenseNo,medicalLicenseExpiryDate);
		this.trainingType = trainingType;
		this.batch = batch;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
