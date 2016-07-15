
package com.mum.cs544.ftms.model;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Flight implements IFlight{
	@GeneratedValue
	@Id
	private long id;
	
	
	private String departureAirport;
	
	private String arrivalAirport;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date flightDate;
	private Timestamp takeoffTime;
	private Timestamp landingTime;
	
	private String flightType;
	private String instructionType;
	
	private int numberOfLandings;
	private int numberOfTakeoffs;
	
	private String aircraftStatus;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private StudentPilot studentPilot;
	@ManyToOne(cascade=CascadeType.ALL)
	private InstructorPilot instructorPilot;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Aircraft aircraft;
	
	public Flight(){}
	
	public Flight(String departureAirport, String arrivalAirport, Timestamp takeoffTime, Timestamp landingTime,
			String flightType, String instructionType, int numberOfLandings, int numberOfTakeOffs,
			String aircraftStatus, StudentPilot studentPilot, InstructorPilot instructorPilot, Aircraft aircraft) {
		super();
		
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.flightType = flightType;
		this.instructionType = instructionType;
		this.numberOfLandings = numberOfLandings;
		this.numberOfTakeoffs = numberOfTakeOffs;
		this.aircraftStatus = aircraftStatus;
		this.studentPilot = studentPilot;
		this.instructorPilot = instructorPilot;
		this.aircraft = aircraft;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Timestamp getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(Timestamp takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public Timestamp getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(Timestamp landingTime) {
		this.landingTime = landingTime;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}

	public int getNumberOfLandings() {
		return numberOfLandings;
	}

	public void setNumberOfLandings(int numberOfLandings) {
		this.numberOfLandings = numberOfLandings;
	}

	public int getNumberOfTakeoffs() {
		return numberOfTakeoffs;
	}

	public void setNumberOfTakeoffs(int numberOfTakeoffs) {
		this.numberOfTakeoffs = numberOfTakeoffs;
	}

	public String getAircraftStatus() {
		return aircraftStatus;
	}

	public void setAircraftStatus(String aircraftStatus) {
		this.aircraftStatus = aircraftStatus;
	}

	public StudentPilot getStudentPilot() {
		return studentPilot;
	}

	public void setStudentPilot(StudentPilot studentPilot) {
		this.studentPilot = studentPilot;
	}

	public InstructorPilot getInstructorPilot() {
		return instructorPilot;
	}

	public void setInstructorPilot(InstructorPilot instructorPilot) {
		this.instructorPilot = instructorPilot;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	
	
}
