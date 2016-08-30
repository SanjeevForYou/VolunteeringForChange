package vfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vfc.service.MemberService;


@Controller
public class LoginController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping({"/login"})
	public String login(){
		//System.out.println(memberService.findMemberByUsername("dewei").getId());
		return "login";
	}
	
	@RequestMapping({"/logout"})
	public String logout(){
		return "redirect:/welcome";
	}
	
	@RequestMapping({"/welcome"})
	public String welcom(){
		return "welcome";
	}

}
