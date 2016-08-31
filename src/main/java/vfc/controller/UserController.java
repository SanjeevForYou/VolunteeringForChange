package vfc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vfc.domain.Authority;
import vfc.domain.Member;
import vfc.service.MemberService;

@Controller
public class UserController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = {"/user/registration"}, method = RequestMethod.GET)
	public String getUserRegistration(@ModelAttribute("userInfo") Member member){
		return "registration";
	}
	
	@RequestMapping(value = {"/user/registration"}, method = RequestMethod.POST)
	public String userRegistration(@Valid @ModelAttribute("userInfo") Member member, BindingResult result, RedirectAttributes redirect){
		System.out.println("reached");
		System.out.println(member.getCredentials().getPassword());
		if(result.hasErrors())
		return "registration";
		
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	    String name = auth.getName(); //get logged in username
	    
	    List<Authority> lst = new ArrayList<Authority>();
	    lst.add(new Authority(member.getCredentials().getUsername(), "ROLE_USER"));
	    member.getCredentials().setAuthority(lst);
//	    PasswordRetypeValidator pwdRetypeCheck = new PasswordRetypeValidator();
//	    pwdRetypeCheck.validate(member.getCredentials(), result);
	    System.out.println("Saving");

	    if(result.hasErrors())
	    	return "registration";
	    
	    memberService.save(member);
	    System.out.println("Saved Succssfully");

		redirect.addFlashAttribute("success", "Registered Successfully!!");
		return "login";
	}
	
//	@InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.setValidator(new PasswordRetypeValidator());
//    }
	
	
	@RequestMapping(value = {"/user/list"}, method = RequestMethod.GET)
	public String userList(Model model){
		List<Member> users =  memberService.findAll();
		System.out.println(users.size());
		model.addAttribute("users", users);
		return "/admin/userList";
	}
	
	@RequestMapping(value = {"/user/profile"}, method = RequestMethod.GET)
	public String profile(@ModelAttribute("profile") Member member, Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in usernam
	    
	    Member profile = memberService.findMemberByUsername(name);
	    model.addAttribute("profile", profile);    
		return "profile";
	}
	
	@RequestMapping(value = {"/user/profile/{username}"}, method = RequestMethod.GET)
	public String profileByUserName(@PathVariable("username") String user, Model model){    
	    Member profile = memberService.findMemberByUsername(user);
	    model.addAttribute("profile", profile);    
		return "profile";
	}

}
