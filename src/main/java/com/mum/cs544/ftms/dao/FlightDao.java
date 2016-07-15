package com.mum.cs544.ftms.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.model.Flight;
import com.mum.cs544.ftms.model.IFlight;


@Repository("flightDao")
@Transactional
public class FlightDao implements IFlightDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveFlight(IFlight flight) {
		
		sessionFactory.getCurrentSession().save(flight);
		
	}
	public List<IFlight> getAllFlights() {
        Query q = sessionFactory.getCurrentSession().createQuery("from Flight");
        return q.list();
    }
	
	@Override
	public void editFlight(int id, IFlight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editFlight(IFlight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override	
	public IFlight getFlightById(int id) {
		// TODO Auto-generated method stub
		return (IFlight) sessionFactory.getCurrentSession().get(Flight.class, id);
	}

	@Override
	public List<IFlight> getFlightDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IFlight> getFlightBetween(Date begDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IFlight> getFlightBetween(int instId, Date begDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFlight(int id) {
		Query deleteQuery=sessionFactory.getCurrentSession().createQuery("DELETE Flight WHERE id=:id");
		deleteQuery.setParameter("id", id);
		deleteQuery.executeUpdate();
	}
	public void deleteFlightByStudentId(int id) {
		Query deleteQuery=sessionFactory.getCurrentSession().createQuery("DELETE Flight f  WHERE f.studentPilot.id=:id");
		deleteQuery.setParameter("id", id);
		deleteQuery.executeUpdate();
	}
	
	@Override
	public IFlight searchFlight(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IFlight> getFlightByInstructorId(int id, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
