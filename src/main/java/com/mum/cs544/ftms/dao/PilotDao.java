package com.mum.cs544.ftms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.Flight;
import com.mum.cs544.ftms.model.InstructorPilot;
import com.mum.cs544.ftms.model.StudentPilot;

@Repository
@Transactional
public class PilotDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
   
	//Adding of Student Pilot
	public void add(StudentPilot studentPilot) {
	
		sessionFactory.getCurrentSession().saveOrUpdate(studentPilot);
		
	}

	//Adding of Instructor Pilot
	public void addInstructor(InstructorPilot instructorPilot) {

		sessionFactory.getCurrentSession().saveOrUpdate(instructorPilot);

	}
	
	//update of Student Pilot
	public StudentPilot get(int id) {
	
		StudentPilot s=(StudentPilot)sessionFactory.getCurrentSession().get(StudentPilot.class, id);
		
		return s;
	}
	
	public void save(StudentPilot student, int id){

		sessionFactory.getCurrentSession().saveOrUpdate(student);
	
	}

	//List of Student Pilot
	@SuppressWarnings("unchecked")
	public List<StudentPilot> listsp() {
		List<StudentPilot> ls =sessionFactory.getCurrentSession().createQuery("from StudentPilot").list();
		return ls;
	}
	
	public void deleteSP(int id) {
//		Query deleteQuery=sessionFactory.getCurrentSession().createQuery("DELETE StudentPilot WHERE id=:id");
//		deleteQuery.setParameter("id", id);
//		deleteQuery.executeUpdate();
		StudentPilot sp = (StudentPilot)sessionFactory.getCurrentSession().load(StudentPilot.class, id);
		//System.out.println(sp.getFirstName());
		sessionFactory.getCurrentSession().delete(sp);
		sessionFactory.getCurrentSession().flush();
		
	}
	public void deleteIP(int id) {
//		Query deleteQuery=sessionFactory.getCurrentSession().createQuery("DELETE InstructorPilot WHERE id=:id");
//		deleteQuery.setParameter("id", id);
//		deleteQuery.executeUpdate();
		
		InstructorPilot ip = (InstructorPilot)sessionFactory.getCurrentSession().load(InstructorPilot.class, id);
		sessionFactory.getCurrentSession().delete(ip);
		
	}
public List<InstructorPilot> getListOfIP() {
		
		
		List<InstructorPilot> ls =sessionFactory.getCurrentSession().createQuery("from InstructorPilot").list();
		
		return ls;
	}
	public List<String> getAllSPCallsigns(){
		List<String> ls =sessionFactory.getCurrentSession().createQuery("select s.callSign from StudentPilot s").list();
		return ls;
	}
	public List<String> getAllIPCallsigns(){
		List<String> ls =sessionFactory.getCurrentSession().createQuery("select i.callSign from InstructorPilot i").list();
		return ls;
	}
	public List<String> getAllACCallsigns(){
		List<String> ls =sessionFactory.getCurrentSession().createQuery("select a.callSign from Aircraft a").list();
		return ls;
	}

	public StudentPilot getStudentPilotByCallsign(String spCallsign) {
		// TODO Auto-generated method stub
		List<StudentPilot>s=sessionFactory.getCurrentSession().createQuery("select s from StudentPilot s where s.callSign='"+spCallsign+"'").list();
		
		if(s.size()>0)
			return s.get(0);
			else return null;
		
	}
	public InstructorPilot getInstructorPilotByCallsign(String ipCallsign) {
		// TODO Auto-generated method stub
		List<InstructorPilot> i=sessionFactory.getCurrentSession().createQuery("select i from InstructorPilot i where i.callSign='"+ipCallsign+"'").list();
		if(i.size()>0)
			return i.get(0);
			else return null;
		
	}
	public List<Flight> getInstructorFlights(String callsign) {
		// TODO Auto-generated method stub
		InstructorPilot pilot = getInstructorPilotByCallsign(callsign);
		Query query = sessionFactory.getCurrentSession().createQuery("select f from Flight f join f.instructorPilot i where i.id = :id");
		query.setParameter("id", pilot.getId());
		
		return query.list();
	}
	
	public Aircraft getAircraftByCallsign(String acCallsign) {
		List<Aircraft> a=sessionFactory.getCurrentSession().createQuery("select a from Aircraft a where a.callSign='"+acCallsign+"'").list();
		if(a.size()>0)
		return a.get(0);
		else return null;
		
	}

	public List<Flight> getstudentFlights(String callsign) {
		// TODO Auto-generated method stub
		StudentPilot student = getStudentPilotByCallsign(callsign);
		Query query = sessionFactory.getCurrentSession().createQuery("select f from Flight f join f.studentPilot s where s.id = :id");
		query.setParameter("id", student.getId());
		
		return query.list();
	}
}
