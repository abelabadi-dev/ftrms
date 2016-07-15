package com.mum.cs544.ftms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.cs544.ftms.dao.AircraftDao;
import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.MaintenanceEngineer;

@Service
@Transactional
public class AircraftService implements IAircraftService {

	@Autowired
	private AircraftDao aircraftDao;

	@Override
	public List<Aircraft> getListOfAircraft() {
		return aircraftDao.getAllAircrafts();
	}

	@Override
	public Aircraft getAircraft(String callSign) {
		return aircraftDao.getAircraft(callSign);
	}

	@Override
	public void deleteAircraft(String callSign) {
		aircraftDao.deleteAircraft(callSign);

	}

	@Override
	public void editAircraft(int id, Aircraft a) {
		aircraftDao.editAircraft(id, a);
	}

	@Override
	public void addAircraft(Aircraft aircraft) {
		aircraftDao.addAircraft(aircraft);

	}

	@Override
	public void addMaintenanceEngineer(MaintenanceEngineer me) {
		aircraftDao.addMaintenanceEngg(me);

	}

}
