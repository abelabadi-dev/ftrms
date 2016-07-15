package com.mum.cs544.ftms.model;

public interface IAirport {
	
	public int getId();
	
	public void setId(int id);		
	
	public String getName();
	
	public void setName(String name);
	
	public String getIcaoName();
	
	public void setIcaoName(String icaoName); 
	
	public String getCountry(); 
	
	public void setCountry(String country); 
	
	public String getCity(); 
	
	public void setCity(String city); 
}
