package vfc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
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
