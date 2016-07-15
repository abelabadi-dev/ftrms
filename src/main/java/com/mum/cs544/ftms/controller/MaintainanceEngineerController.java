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

@Controller
public class MaintainanceEngineerController {
	@Autowired
	private AircraftService aircraftService;
	
	
	public void setAircraftService(AircraftService aircraftService) {
		this.aircraftService = aircraftService;
	}

	
	@RequestMapping(value = "/engineerMain", method = RequestMethod.GET)
	public String managerMain(Model model){
		model.addAttribute("ac",aircraftService.getListOfAircraft());
		return "engineerMain";
	}
	
	@RequestMapping(value = "/aircraft", method = RequestMethod.GET)
	public String add(@ModelAttribute("ac") Aircraft ac){
		return "addAircraft";
		
	}
	
	@RequestMapping(value="/aircraft", method=RequestMethod.POST)
	public String add(Aircraft aircraft, BindingResult result ) {
		String view = "redirect:/engineerMain";
       
            aircraftService.addAircraft(aircraft);
            return view;
	}
	
	//Maintenance Engineer
	@RequestMapping(value = "/addME", method = RequestMethod.GET)
	public String addME(@ModelAttribute("me") MaintenanceEngineer me){
		return "addMaintenanceEngineer";
		
	}
	
	@RequestMapping(value="/addME", method=RequestMethod.POST)
	public String add(@ModelAttribute("me") MaintenanceEngineer maintenanceENgineer, BindingResult result ) {
		String view = "redirect:/engineerMain";
       if (!result.hasErrors()) {
            aircraftService.addMaintenanceEngineer(maintenanceENgineer);
       } else {
            view = "error";
       }
        return view;
	}
}
