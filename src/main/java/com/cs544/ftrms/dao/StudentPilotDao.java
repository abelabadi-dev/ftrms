package com.cs544.ftrms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cs544.ftrms.model.StudentPilot;


@Repository
public class StudentPilotDao {
	@Autowired
	private SessionFactory sessionFactory;

	public StudentPilotDao() {
		this.sessionFactory = sessionFactory;
	}

	public void add(StudentPilot studentPilot) {
		sessionFactory.getCurrentSession().save(studentPilot);
	}

	public StudentPilot get(int id) {
		return (StudentPilot) ((Session) sessionFactory.getSessionFactoryOptions()).get(StudentPilot.class, id);
	}

	public List<StudentPilot> getAll() {
		return (List<StudentPilot>) sessionFactory.getCurrentSession().createQuery("from StudentPilot").list();
	}

}
