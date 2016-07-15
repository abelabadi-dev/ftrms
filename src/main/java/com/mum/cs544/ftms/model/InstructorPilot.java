package com.mum.cs544.ftms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
public class InstructorPilot extends Pilot {
	@NotNull
	private String classRating;
	@NotNull @Temporal(TemporalType.DATE)
	private Date ratingDate;
	
	public InstructorPilot() {
	}

/*	public InstructorPilot(String firstName, String lastName, String gender, int age, String nationality,String callSign, String licenseNo, String medicalLicenseNo, Date medicalLicenseExpiryDate,String classRating, Date ratingDate) {
		super(firstName, lastName, gender, age, nationality,callSign, licenseNo, medicalLicenseNo,medicalLicenseExpiryDate);
		this.classRating = classRating;
		this.ratingDate=ratingDate;
	}*/

	public String getClassRating() {
		return classRating;
	}

	public void setClassRating(String classRating) {
		this.classRating = classRating;
	}

	public Date getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}
}
