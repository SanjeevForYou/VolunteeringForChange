package vfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping({"/interest"})
	public String interst(Model model){
		return "testInterest";
	}
	
	@RequestMapping("/rest/interest/{eventid}")
	public @ResponseBody String restInterest(@PathVariable("eventid") int eventid){
		return "testInterest";
	}
}
