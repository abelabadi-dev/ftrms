package com.cs544.ftrms.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Aircraft {
	@Id
	@GeneratedValue
	private int id;
	private long aircraftNumber;
	private String callSign;
	private String aircraftType;
	
	@Temporal(TemporalType.DATE)
	private Date airworthyDate;
	
	@Temporal(TemporalType.DATE)
	private Date nextInspectionDate;


	public Aircraft(){}
	
	public Aircraft(long aircraftNumber, String callSign, String aircraftType, Date airworthyDate,
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

	public long getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(long aircraftNumber) {
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
