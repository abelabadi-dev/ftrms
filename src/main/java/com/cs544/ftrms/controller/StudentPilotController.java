package com.cs544.ftrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cs544.ftrms.dao.StudentPilotDao;
import com.cs544.ftrms.model.StudentPilot;

@Controller
public class StudentPilotController {

	@Autowired
	private StudentPilotDao studentPilotDao;

	@RequestMapping (value="/addStudentPilots", method=RequestMethod.GET)
	public String addStudentPilotForm(@ModelAttribute StudentPilot sp){
		return "addStudentPilot";
	}
	
	@RequestMapping(value="/addStudentPilots", method=RequestMethod.POST)
	public String addStudent(StudentPilot studentPilot){
		studentPilotDao.add(studentPilot);
		return "redirect:/studentPilotList";	
	}
	
	@RequestMapping(value="/spList", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("books", studentPilotDao.getAll());
		return "studentPilotList";
	}
	@ExceptionHandler(value = NoSuchResourceException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("noSuchResource");
		return mv;
	}
}
