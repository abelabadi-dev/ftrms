package com.mum.cs544.ftms.service;

import java.util.Date;
import java.util.List;

import com.mum.cs544.ftms.model.IAirport;

public interface IAirportService {
	public void saveAirport(IAirport airport);
	public void editAirport(long id,IAirport airport);
	public void editAirport(IAirport airport);
	
	
	public IAirport getAirportById(long id);
	public IAirport getAirportByIcaoName(String icaoName);
	public List<IAirport> getAirportByCity(String city);
	public List<IAirport> getAirportByCountry(String country);
	public void deleteAirport(long id);
	//public IAirport searchAirport(long id);
	

}
