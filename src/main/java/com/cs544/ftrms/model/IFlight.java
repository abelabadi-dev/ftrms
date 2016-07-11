package com.cs544.ftrms.model;

import java.util.Date;

import com.cs544.ftrms.enumeration.AircraftStatus;
import com.cs544.ftrms.enumeration.FlightType;
import com.cs544.ftrms.enumeration.InstructionType;

public interface IFlight {

	public long getId();

	public void setId(long id);

	public Airport getDepartureAirport();

	public void setDepartureAirport(IAirport departureAirport);

	public Airport getArrivalAirport();

	public void setArrivalAirport(IAirport arrivalAirport);

	public Date getTakeoffTime();

	public void setTakeoffTime(Date takeoffTime);

	public Date getLandingTime();

	public void setLandingTime(Date landingTime);

	public FlightType getFlightType();

	public void setFlightType(FlightType flightType);

	public InstructionType getInstructionType();

	public void setInstructionType(InstructionType instructionType);

	public int getNumberOfLandings();

	public void setNumberOfLandings(int numberOfLandings);

	public int getNumberOfTakeOffs();

	public void setNumberOfTakeOffs(int numberOfTakeOffs);

	public AircraftStatus getAircraftStatus();

	public void setAircraftStatus(AircraftStatus aircraftStatus);

	public Pilot getStudentPilot();

	public void setStudentPilot(Pilot studentPilot);

	public Pilot getInstructorPilot();

	public void setInstructorPilot(IPilot instructorPilot);

	public Aircaft getAircraft();

	public void setAircraft(Aircaft aircraft); 
	
	

}
