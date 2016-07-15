package com.mum.cs544.ftms.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.model.IAirport;


@Repository("airportDao")
@Transactional(propagation=Propagation.MANDATORY)
public class AirportDao implements IAirportDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveAirport(IAirport airport) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(airport);
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

//	@Override
//	public IAirport searchAirport(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}	

}
