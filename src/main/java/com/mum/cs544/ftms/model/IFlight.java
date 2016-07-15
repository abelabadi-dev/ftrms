package com.mum.cs544.ftms.model;

import java.sql.Timestamp;
import java.util.Date;

import com.cs544.ftms.enumeration.AircraftStatus;
import com.cs544.ftms.enumeration.FlightType;
import com.cs544.ftms.enumeration.InstructionType;

public interface IFlight {

	public long getId();

	public void setId(long id);

	public String getDepartureAirport();

	public void setDepartureAirport(String departureAirport);

	public String getArrivalAirport();

	public void setArrivalAirport(String arrivalAirport);

	public Timestamp getTakeoffTime();

	public void setTakeoffTime(Timestamp takeoffTime);

	public Timestamp getLandingTime();

	public void setLandingTime(Timestamp landingTime);

	public String getFlightType();

	public void setFlightType(String flightType);

	public String getInstructionType();

	public void setInstructionType(String instructionType);

	public int getNumberOfLandings();

	public void setNumberOfLandings(int numberOfLandings);

	public int getNumberOfTakeoffs();

	public void setNumberOfTakeoffs(int numberOfTakeOffs);

	public String getAircraftStatus();

	public void setAircraftStatus(String aircraftStatus);

	public StudentPilot getStudentPilot();

	public void setStudentPilot(StudentPilot studentPilot);

	public InstructorPilot getInstructorPilot();

	public void setInstructorPilot(InstructorPilot instructorPilot);

	public Aircraft getAircraft();

	public void setAircraft(Aircraft aircraft); 
	
	public Date getFlightDate();

	public void setFlightDate(Date flightDate);

}
