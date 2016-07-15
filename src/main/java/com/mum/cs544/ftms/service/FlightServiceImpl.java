package com.mum.cs544.ftms.service;

import java.util.Date;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.dao.FlightDao;
import com.mum.cs544.ftms.dao.IFlightDao;

import com.mum.cs544.ftms.model.IFlight;
@Service("flightServiceImpl")
public class FlightServiceImpl implements IFlightService{
	
	@Autowired
    private IFlightDao flightDao;
    
	
	public void setFlightDao(IFlightDao flightDao) {
		this.flightDao = flightDao;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveFlight(IFlight flight) {
	
		flightDao.saveFlight(flight);
		
	}
	public List<IFlight> getAllFlights() {
        return flightDao.getAllFlights();
    }
	
	@Override
	public void editFlight(int id, IFlight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editFlight(IFlight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IFlight getFlightById(int id) {
		return flightDao.getFlightById(id);
	}
	
	@Override
	public List<IFlight> getFlightByInstructorId(int id,Date date){
		return null;
	}

	@Override
	public List<IFlight> getFlightDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IFlight> getFlightBetween(Date begDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteFlight(int id) {
		// TODO Auto-generated method stub
		flightDao.deleteFlight(id);
		
	}
	public void deleteFlightByStudentId(int id) {
		flightDao.deleteFlightByStudentId(id);
		
	}

	@Override
	public IFlight searchFlight(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IFlight> getFlightBetween(int instId, Date begDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
