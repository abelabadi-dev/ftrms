package com.cs544.ftrms.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cs544.ftrms.model.Aircraft;

@Repository
public class AircraftDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public AircraftDao(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public void addAircraft(Aircraft aircraft){
		sessionFactory.getCurrentSession().save(aircraft);	
	}
	
	public Aircraft getAircraft(String callSign){
		return (Aircraft)sessionFactory.getCurrentSession().get(Aircraft.class, callSign);
	}
	
	public void deleteAircraft(String callSign){
		Aircraft ac = (Aircraft)sessionFactory.getCurrentSession().load(Aircraft.class, callSign);
		sessionFactory.getCurrentSession().delete(ac);
	}
	
	@SuppressWarnings("unchecked")
	public List<Aircraft> getAllAircrafts(){
		return sessionFactory.getCurrentSession().createQuery("from Aircraft").list();
	}
	
	public void editAircraft(int id, Aircraft a){
		Aircraft ac = (Aircraft)sessionFactory.getCurrentSession().load(Aircraft.class, id);
		sessionFactory.getCurrentSession().update(ac);
	}
}
