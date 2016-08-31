package vfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vfc.service.EventManagementService;

@Controller
public class HomeController {
	
	@Autowired
	EventManagementService eventService;
	
	@RequestMapping({"/", "/home"})
	public String home(Model model){
		model.addAttribute("listOfEvents", eventService.getAllEvents());
		return "home";
	}
}
