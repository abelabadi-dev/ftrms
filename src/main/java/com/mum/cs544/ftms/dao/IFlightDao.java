package com.mum.cs544.ftms.dao;

import java.util.Date;
import java.util.List;

import com.mum.cs544.ftms.model.IFlight;

public interface IFlightDao {

	public void saveFlight(IFlight flight);
	public void editFlight(int id,IFlight flight);
	public void editFlight(IFlight flight);
	
	public List<IFlight> getAllFlights();
	public IFlight getFlightById(int id);
	public List<IFlight> getFlightDate(Date date);
	public List<IFlight> getFlightBetween(Date begDate,Date endDate);
	public List<IFlight> getFlightBetween(int instId,Date begDate,Date endDate);
	public void deleteFlight(int id);
	public void deleteFlightByStudentId(int id);
	public IFlight searchFlight(int id);
	public List<IFlight> getFlightByInstructorId(int id, Date date);
}
