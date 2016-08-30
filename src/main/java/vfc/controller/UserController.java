package vfc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vfc.domain.Authority;
import vfc.domain.Member;
import vfc.repository.MemberRepository;
import vfc.service.MemberService;

@Controller
public class UserController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
	public String getUserRegistration(@ModelAttribute("userInfo") Member member){
		return "registration";
	}
	
	@RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
	public String userRegistration(@Valid @ModelAttribute("userInfo") Member member, BindingResult result, RedirectAttributes redirect){
		System.out.println("reached");
		System.out.println(member.getCredentials().getPassword());
		if(result.hasErrors())
		return "registration";
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in username
	    
	    List<Authority> lst = new ArrayList<Authority>();
	    lst.add(new Authority(name, "ROLE_USER"));
	    member.getCredentials().setAuthority(lst);
	    
	    memberService.save(member);

		redirect.addFlashAttribute("success", "Registered Successfully!!");
		return "login";
	}
}
