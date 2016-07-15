package com.mum.cs544.ftms.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.MaintenanceEngineer;

@Repository
@Transactional
public class AircraftDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void setSessionFactory(SessionFactory sessionFactory) {
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
	
	//Maintenance Engineer
	public void addMaintenanceEngg(MaintenanceEngineer maintenanceEngineer){

		sessionFactory.getCurrentSession().save(maintenanceEngineer);

	}
	
}
