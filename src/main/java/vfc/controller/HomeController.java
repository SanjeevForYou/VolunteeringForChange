package vfc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/", "/home"})
	public String home(){
		return "home";
	}
	
	@RequestMapping({"/login"})
	public String login(){
		return "home";
	}
	
	@RequestMapping({"/logout"})
	public String logout(){
		return "home";
	}
	
	@RequestMapping({"/login"})
	public String signIn(){
		return "home";
	}
}
