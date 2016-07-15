package com.mum.cs544.ftms.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class StudentPilot extends Pilot {
	//@NotNull
	private String trainingType;
	//@NotNull
	private String batch;
	//@NotNull
	private String status;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Flight> flights;
	public StudentPilot() {
	}
	
	/*public StudentPilot(String firstName, String lastName, String gender, int age, String nationality,String callSign, String licenseNo, String medicalLicenseNo, Date medicalLicenseExpiryDate,String trainingType, String batch, String status) {
		super(firstName, lastName, gender, age, nationality,callSign, licenseNo, medicalLicenseNo,medicalLicenseExpiryDate);
		this.trainingType = trainingType;
		this.batch = batch;
		this.status = status;
	}*/

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
