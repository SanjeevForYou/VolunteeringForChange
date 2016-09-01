package vfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vfc.domain.Member;
import vfc.service.MemberService;

@Controller
@RequestMapping("/admin/memberEvent")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping("approve/{id}")
	public String displayMember(@PathVariable int id ,Model model){
		List<Member> member=memberService.findMembersByEventId(id);
		model.addAttribute("userInEvent", member);
//		for(Member m: member){
//		System.out.println(m);}
		return "eventVolunteer";
	}
}
