package com.mum.cs544.ftms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.cs544.ftms.model.InstructorPilot;
import com.mum.cs544.ftms.model.StudentPilot;
import com.mum.cs544.ftms.service.FlightServiceImpl;
import com.mum.cs544.ftms.service.PilotService;

@Controller
public class PilotController {

	@Autowired
	PilotService studentPilotService;

	@Autowired
	private FlightServiceImpl flightServiceImpl;
	
	@RequestMapping("/pilotcontroll")
	public String getHome() {
		return "list";
	}

	@RequestMapping(value = "/addSP", method = RequestMethod.GET)
	public String addStudentPilotForm(@ModelAttribute StudentPilot sp, Model model) {
		model.addAttribute("sp", sp);
		return "addStudentPilot";
	}

	@RequestMapping(value = "/addSP", method = RequestMethod.POST)
	public String addStudent(@Valid StudentPilot sp, BindingResult result, Model model){
		if (result.hasErrors())
			return "redirect:/addSP";
		else {
			studentPilotService.addStudentPilot(sp);
			return "redirect:/admin";
		}
	}

	@RequestMapping(value = "/listSP", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("spList", studentPilotService.getListOfSP());
		return "listStudentPilot";
	}

	@RequestMapping(value = "/addIP", method = RequestMethod.GET)
	public String addInstructorPilotForm(@ModelAttribute("ip") InstructorPilot i) {
		return "addInstructorPilot";
	}

	@RequestMapping(value = "/addIP", method = RequestMethod.POST)
	public String addInstructor(@Valid InstructorPilot ip, BindingResult result,Model model) {
		if (result.hasErrors())
			return "redirect:/addIP";
		else {
			studentPilotService.addInstructorPilot(ip);
			return "redirect:/admin";
		}
	}
	
	
 
	//edit Student
	
	@RequestMapping(value="/editSP/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		
		StudentPilot s=studentPilotService.getId(id);
		model.addAttribute("sp",s);
		return "addStudentPilot";
	}  
	
	  

	@RequestMapping(value="/editSP/{id}", method=RequestMethod.POST)
	public String update(@Valid StudentPilot sp, BindingResult result, @PathVariable int id, Model model) {
        return addStudent(sp, result,model);
	}
	@RequestMapping(value = "/deleteSP", method=RequestMethod.GET)
	public String deleteFlight(int id) {	

		flightServiceImpl.deleteFlightByStudentId(id);
		studentPilotService.deleteSP(id);
		return "redirect:/admin";
	}
	
	@RequestMapping(value = "/deleteIP", params="id", method=RequestMethod.GET)
	public String deleteIP(@RequestParam("id") int id) {	
		System.out.println("id: " + id );
		studentPilotService.deleteIP(id);
		return "redirect:/admin";
	}
}
