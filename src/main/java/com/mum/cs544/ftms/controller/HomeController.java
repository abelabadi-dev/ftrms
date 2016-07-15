package com.mum.cs544.ftms;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.cs544.ftms.service.PilotService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	String callsign;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	PilotService PilotService;
	public void setPilotService(PilotService PilotService) {
		this.PilotService = PilotService;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model){
		
			return "login";
	}


	
    @RequestMapping(value = "/successController", method = RequestMethod.GET)
    public String success(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_INSTRUCTOR")) {
        	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            callsign = auth.getName();
            return "redirect:/instructorMain";
        }else if(request.isUserInRole("ROLE_STUDENT")){
        	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            callsign = auth.getName();
        	System.out.println("callsign1 "+callsign);
        	return "redirect:/studentMain";
        }else if(request.isUserInRole("ROLE_MANAGER")){
        	return "redirect:/managerMain";
        }else if(request.isUserInRole("ROLE_ADMIN")){
        	return "redirect:/admin";
        }else if(request.isUserInRole("ROLE_ENGINEER")){
        	return "redirect:/engineerMain";
        }	
        return "/";
    }

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Model model){
		 model.addAttribute("spList", PilotService.getListOfSP());
		 model.addAttribute("ipList", PilotService.getListOfIP());
			return "admin";
	}
	//studentMain
	@RequestMapping(value = "/studentMain", method = RequestMethod.GET)
	public String studentMain(Model model){
		 model.addAttribute("flights", PilotService.getStudentReport(this.callsign));
		 //System.out.println("callsign "+callsign);
			return "studentMain";
	}
	//instructorMain
	@RequestMapping(value = "/instructorMain", method = RequestMethod.GET)
	public String instructorMain(Model model){
		model.addAttribute("flights", PilotService.getInstructorFlights(this.callsign));
			return "instructorMain";
	}
	
	
	
}
