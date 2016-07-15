package com.mum.cs544.ftms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.cs544.ftms.dao.PilotDao;
import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.Flight;
import com.mum.cs544.ftms.model.InstructorPilot;
import com.mum.cs544.ftms.model.StudentPilot;

@Service
@Transactional
public class PilotService {
	@Autowired
	PilotDao studentPilotDao;
	
	public void addStudentPilot(StudentPilot studentPilot){
		studentPilotDao.add(studentPilot);
	}
	
	public List<StudentPilot> getListOfSP(){
		return studentPilotDao.listsp();
	}
	public List<InstructorPilot> getListOfIP(){
		return studentPilotDao.getListOfIP();
	}
	
	public void addInstructorPilot(InstructorPilot instructorPilot){
		studentPilotDao.addInstructor(instructorPilot);
	}
	
	public StudentPilot getId(int id){
		return studentPilotDao.get(id);
		
	}
	public List<Flight> getStudentReport(String callsign){
		return studentPilotDao.getstudentFlights(callsign);
	}
	public void updateSP(StudentPilot s, int id){
		studentPilotDao.save(s,id);
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void deleteSP(int id) {
		studentPilotDao.deleteSP(id);
	}
	public void deleteIP(int id) {
		studentPilotDao.deleteIP(id);
	}
	public List<String> getAllSPCallsigns(){
		return studentPilotDao.getAllSPCallsigns();
	}
	public List<String> getAllIPCallsigns(){
		return studentPilotDao.getAllIPCallsigns();
	}
	
	public List<String> getAllACCallsigns(){
		return studentPilotDao.getAllACCallsigns();
	}

	public StudentPilot getStudentPilotByCallsign(String spCallsign) {
		// TODO Auto-generated method stub
		return studentPilotDao.getStudentPilotByCallsign(spCallsign);
	}
	
	public InstructorPilot getInstructorPilotByCallsign(String ipCallsign) {
		// TODO Auto-generated method stub
		return studentPilotDao.getInstructorPilotByCallsign(ipCallsign);
	}
	public Aircraft getAircraftByCallsign(String acCallsign) {
		// TODO Auto-generated method stub
		return studentPilotDao.getAircraftByCallsign(acCallsign);
	}

	public List<Flight> getInstructorFlights(String callsign) {
		
		return studentPilotDao.getInstructorFlights(callsign);
	}
}
