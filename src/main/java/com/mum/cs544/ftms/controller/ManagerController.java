package com.mum.cs544.ftms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.cs544.ftms.model.Aircraft;
import com.mum.cs544.ftms.model.MaintenanceEngineer;
import com.mum.cs544.ftms.service.AircraftService;
import com.mum.cs544.ftms.service.FlightServiceImpl;
import com.mum.cs544.ftms.service.PilotService;

@Controller
public class ManagerController {
	
	@Autowired
	private FlightServiceImpl flightServiceImpl;
	@Autowired
	private PilotService pilotService;
	
	@RequestMapping(value = "/managerMain", method = RequestMethod.GET)
	public String managerMain(Model model){
		model.addAttribute("flights",flightServiceImpl.getAllFlights());
		return "managerMain";
			
	}
	
}
