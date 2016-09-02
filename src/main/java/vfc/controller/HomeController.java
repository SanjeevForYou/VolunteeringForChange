package vfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vfc.domain.Event;
import vfc.domain.EventMember;
import vfc.domain.Member;
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
		List<Event> events = eventService.getAllEvents();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in username
	    
	    Member member = memberService.findMemberByUsername(name);
		
		for(Event event : events)
		{
			if(member != null)
			{
				System.out.println(event.getEventId()+" "+member.getId());
				if(!eventMemberService.isUserEventExist(event.getEventId(), member.getId()))
				{
					event.setMark(1);
				}
				else
					event.setMark(0);
			}
			else
				event.setMark(0);
		}
		
		model.addAttribute("listOfEvents", events);
		return "home";
	}
	
	@RequestMapping({"/interest"})
	public String interst(Model model){
		return "testInterest";
	}
	
/*	@RequestMapping(value = "/rest/interest/{eventid}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<String> restInterest(@PathVariable("eventid") int eventid){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName();
		if(name==null){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		EventMember eventMember = new EventMember();
		Event event = eventService.findEventById(eventid);
		eventMember.setEvent(event);
		
		Member member = memberService.findMemberByUsername(name);
		System.out.println("member name= "+member);
		eventMember.setMember(member);
		
        eventMemberService.saveEventMember(eventMember);
        return new ResponseEntity<String>(HttpStatus.OK);
	}*/
	
	@RequestMapping(value = "/rest/interest/{eventid}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody EventMember restInterest(@PathVariable("eventid") int eventid){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName();
	    
	    EventMember eventMember = new EventMember();
		if(name==null){
			eventMember.setMember_status("NOT_LOGGED_IN");
			return eventMember;
		}
		
		Event event = eventService.findEventById(eventid);
		eventMember.setEvent(event);
		
		Member member = memberService.findMemberByUsername(name);
		eventMember.setMember(member);
	     
        eventMemberService.saveEventMember(eventMember);
    	eventMember.setMember_status("LOGGED_IN");
        return eventMember;
	}
}
