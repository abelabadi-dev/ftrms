package com.mum.cs544.ftms.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aircraft {
	@GeneratedValue
	@Id
	private int id;
	private String aircraftNumber;
	private String callSign;
	private String aircraftType;
	
	
	private Date airworthyDate;
	
	
	private Date nextInspectionDate;


	public Aircraft(){}
	
	public Aircraft(String aircraftNumber, String callSign, String aircraftType, Date airworthyDate,
			Date nextInspectionDate) {
		super();
		this.aircraftNumber = aircraftNumber;
		this.callSign = callSign;
		this.aircraftType = aircraftType;
		this.airworthyDate = airworthyDate;
		this.nextInspectionDate = nextInspectionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(String aircraftNumber) {
		this.aircraftNumber = aircraftNumber;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Date getAirworthyDate() {
		return airworthyDate;
	}

	public void setAirworthyDate(Date airworthyDate) {
		this.airworthyDate = airworthyDate;
	}

	public Date getNextInspectionDate() {
		return nextInspectionDate;
	}

	public void setNextInspectionDate(Date nextInspectionDate) {
		this.nextInspectionDate = nextInspectionDate;
	}



	
}
