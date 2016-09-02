package vfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vfc.domain.Event;
import vfc.repository.EventManagementRepository;
import vfc.service.CategoryManagementService;
import vfc.service.EventManagementService;

@Controller
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventManagementService eventManagementService;
	
	@Autowired
	CategoryManagementService categoryManagementService;
	
	@RequestMapping(value="/all")
	public String listEvent(Model model){
	
		model.addAttribute("events", eventManagementService.getAllEvents());
		
		return "listEvent";
		
	}
	
	@RequestMapping(value="/addEvent" ,method=RequestMethod.GET)
	public String addEventForm(@ModelAttribute Event event , Model model){
		model.addAttribute("category", categoryManagementService.getAllCategories());
		return "addEvents";
		
	}
	
	@RequestMapping(value="/addEvent" ,method=RequestMethod.POST)
	public String addEvent(@ModelAttribute Event event){
		eventManagementService.saveEvent(event);
		return "redirect:/admin/event/addEvent";
		
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteEvent(@PathVariable int id){
		eventManagementService.deleteEvent(id);
		return "redirect:/admin/event/all";
	}
	
	@RequestMapping(value="/getdetails/{id}")
	public String getEventById(@PathVariable int id, Model model){
		Event event=eventManagementService.findEventById(id);
		System.out.println(event);
		model.addAttribute("event", eventManagementService.findEventById(id));
			return "eventDetails";
		
		}
	@RequestMapping(value="/edit/{id}")
	public String editEvent(@PathVariable int id, Model model){
		model.addAttribute("category", categoryManagementService.getAllCategories());
		model.addAttribute("event",eventManagementService.findEventById(id) );
		return "addEvents";
	}
	
	//Controller for displaying Events according to category Ef.
	
		@RequestMapping(value="/retrieveEventByCategory", method=RequestMethod.POST)
		public @ResponseBody List<Event> getEventList(@RequestParam("id") int categoryid){
			System.out.println("I am here in Event Controller");
			List<Event> listOfEvents=eventManagementService.getEventByCategoryId(categoryid);
			for(Event l : listOfEvents){
				System.out.println(l);
			}
			return listOfEvents;	
		}
		
	/*	@RequestMapping(value="/retrieveEventByCategory", method=RequestMethod.POST)
		public @ResponseBody String getEventList(){
			System.out.println("I am in an Event");
			
			String a="I am String";
			return a;	
		}*/


}
