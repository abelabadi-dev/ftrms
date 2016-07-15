package com.mum.cs544.ftms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airport {
	@GeneratedValue
	@Id
	private int id;
	private String name;
	private String icaoName;
	private String country;
	private String city;
	public Airport(){
		
	}
	public Airport(int id, String name, String icaoName, String country, String city) {
		super();
		this.id = id;
		this.name = name;
		this.icaoName = icaoName;
		this.country = country;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcaoName() {
		return icaoName;
	}
	public void setIcaoName(String icaoName) {
		this.icaoName = icaoName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
