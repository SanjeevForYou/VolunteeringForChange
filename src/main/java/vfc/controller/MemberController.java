package vfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vfc.domain.EventMember;
import vfc.domain.EventMemberJSON;
import vfc.domain.Member;
import vfc.service.EventMemberService;
import vfc.service.MemberService;

@Controller
@RequestMapping("/admin/memberEvent")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@Autowired
	EventMemberService eventMemberService;
	
	@RequestMapping("/approve/{id}")
	public String displayMember(@PathVariable int id ,Model model){
		List<Member> member=memberService.findMembersByEventId(id);
		model.addAttribute("userInEvent", member);
//		for(Member m: member){
//		System.out.println(m);}
		return "eventVolunteer";
	}
	
	@RequestMapping("/list/{eventid}")
	public String userListInEvent(@PathVariable int eventid ,Model model){
	    
		List<Member> member=memberService.findMembersByEventId(eventid);
		
		//setting either member is approved or not
		for(Member mem : member)
		{
			mem.setMark(eventMemberService.getEventMemberByEventUserID(eventid, mem.getId()).getApproval());			
		}
		
		model.addAttribute("userInEvent", member);
		model.addAttribute("eventid", eventid);
		
		return "eventVolunteer";
	}
	
	@RequestMapping(value = "/approve", method = RequestMethod.PUT)
	public @ResponseBody EventMemberJSON userApproval(@RequestBody EventMemberJSON eventMemberJson, Model model){
	    
		EventMember eventMember = eventMemberService.getEventMemberByEventUserID(eventMemberJson.getEventid(), eventMemberJson.getMemberid());
		
		if(eventMember == null)
		{
			eventMemberJson.setMember_status("FAILED");
			return eventMemberJson;
		}
		
		eventMember.setApproval(eventMemberJson.getApproval());
		eventMemberService.saveEventMember(eventMember);		
		eventMemberJson.setMember_status("SUCCESS");

		return eventMemberJson;
	}
}
