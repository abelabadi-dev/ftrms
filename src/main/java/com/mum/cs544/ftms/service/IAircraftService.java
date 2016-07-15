package com.mum.cs544.ftms.service;

import java.util.List;

import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.MaintenanceEngineer;

public interface IAircraftService {
	public List<Aircraft> getListOfAircraft();
	public Aircraft getAircraft(String callSign);
	public void deleteAircraft(String callSign);
	public void editAircraft(int id, Aircraft a);
	public void addAircraft(Aircraft a);
	public void addMaintenanceEngineer(MaintenanceEngineer me);
}
