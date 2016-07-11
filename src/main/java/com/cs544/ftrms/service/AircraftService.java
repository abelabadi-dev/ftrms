package com.cs544.ftrms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.ftrms.dao.AircraftDao;
import com.cs544.ftrms.model.Aircraft;
import com.cs544.ftrms.model.IAircraft;

@Service
public class AircraftService implements IAircraft{
	@Autowired
	SessionFactory sessionFactory;
	private AircraftDao aircraftDao;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void setAircraftDao(AircraftDao aircraftDao) {
		this.aircraftDao = aircraftDao;
	}
	
	@Transactional
	public List<Aircraft> getListOfAircraft(){
		return aircraftDao.getAllAircrafts();
		
	}
	
	public Aircraft getAircraft(String callSign){
		return aircraftDao.getAircraft(callSign);
	}
	
	public void deleteAircraft(String callSign){
		aircraftDao.deleteAircraft(callSign);
	}
	@Override
	public void editAircraft(int id, Aircraft a) {
		aircraftDao.editAircraft(id, a);
		
	}
	
	
	
}
