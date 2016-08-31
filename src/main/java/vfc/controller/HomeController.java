package vfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vfc.domain.EventMember;
import vfc.service.EventManagementService;
import vfc.service.EventMemberService;
import vfc.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	EventManagementService eventService;
	
	@Autowired
	EventMemberService eventMemberService;
	
	@Autowired
	MemberService memberService;
	
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
	public @ResponseBody EventMember restInterest(@PathVariable("eventid") int eventid){
		EventMember eventMember = new EventMember();
		eventMember.getEvent().setEventId(eventid);
		
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        
        eventMember.getMember().setId(memberService.findMemberByUsername(name).getId());
        eventMember.setApproval(0); //default
		return eventMemberService.saveEventMember(eventMember);
	}
}
