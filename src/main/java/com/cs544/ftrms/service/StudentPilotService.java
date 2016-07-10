package com.cs544.ftrms.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cs544.ftrms.dao.StudentPilotDao;
import com.cs544.ftrms.model.StudentPilot;

@Service
public class StudentPilotService {
	@Autowired
	private StudentPilotDao studentPilotDao;
	private SessionFactory sessionFactory;

	public StudentPilotService() {	}
    
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void addStudentPilot(StudentPilot studentPilot){
		studentPilotDao.add(studentPilot);
	}
}
