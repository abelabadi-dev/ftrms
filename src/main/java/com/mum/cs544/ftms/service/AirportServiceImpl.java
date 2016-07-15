package com.mum.cs544.ftms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.dao.IAirportDao;
//import com.mum.cs544.ftms.dao.IFlightDao;
import com.mum.cs544.ftms.model.IAirport;

@Service("airportService")
public class AirportServiceImpl implements IAirportService{
	@Autowired
    private IAirportDao airportDao;
    
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void saveAirport(IAirport airport) {
		// TODO Auto-generated method stub
		airportDao.saveAirport(airport);		
	}

	@Override
	public void editAirport(long id, IAirport airport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editAirport(IAirport airport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IAirport getAirportById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAirport getAirportByIcaoName(String icaoName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAirport> getAirportByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAirport> getAirportByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAirport(long id) {
		// TODO Auto-generated method stub
		
	}	

}
