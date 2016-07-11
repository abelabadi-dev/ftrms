package com.cs544.ftrms.model;

import java.util.Date;

import com.cs544.ftrms.enumeration.AircraftStatus;
import com.cs544.ftrms.enumeration.FlightType;
import com.cs544.ftrms.enumeration.InstructionType;

public class Flight {
	private long id;
	
	private Airport departureAirport;
	private Airport arrivalAirport;
	
	private Date takeoffTime;
	private Date landingTime;
	
	private FlightType flightType;
	private InstructionType instructionType;
	
	private int numberOfLandings;
	private int numberOfTakeOffs;
	
	private AircraftStatus aircraftStatus;
	
	private Pilot studentPilot;
	private Pilot instructorPilot;
	private Aircraft aircraft;
	
	public Flight(){}
	
	public Flight(long id, Airport departureAirport, Airport arrivalAirport, Date takeoffTime, Date landingTime,
			FlightType flightType, InstructionType instructionType, int numberOfLandings, int numberOfTakeOffs,
			AircraftStatus aircraftStatus, Pilot studentPilot, Pilot instructorPilot, Aircraft aircraft) {
		super();
		this.id = id;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.flightType = flightType;
		this.instructionType = instructionType;
		this.numberOfLandings = numberOfLandings;
		this.numberOfTakeOffs = numberOfTakeOffs;
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

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Date getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(Date takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public Date getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(Date landingTime) {
		this.landingTime = landingTime;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	public InstructionType getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(InstructionType instructionType) {
		this.instructionType = instructionType;
	}

	public int getNumberOfLandings() {
		return numberOfLandings;
	}

	public void setNumberOfLandings(int numberOfLandings) {
		this.numberOfLandings = numberOfLandings;
	}

	public int getNumberOfTakeOffs() {
		return numberOfTakeOffs;
	}

	public void setNumberOfTakeOffs(int numberOfTakeOffs) {
		this.numberOfTakeOffs = numberOfTakeOffs;
	}

	public AircraftStatus getAircraftStatus() {
		return aircraftStatus;
	}

	public void setAircraftStatus(AircraftStatus aircraftStatus) {
		this.aircraftStatus = aircraftStatus;
	}

	public Pilot getStudentPilot() {
		return studentPilot;
	}

	public void setStudentPilot(Pilot studentPilot) {
		this.studentPilot = studentPilot;
	}

	public Pilot getInstructorPilot() {
		return instructorPilot;
	}

	public void setInstructorPilot(Pilot instructorPilot) {
		this.instructorPilot = instructorPilot;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	} 
	
	
}
