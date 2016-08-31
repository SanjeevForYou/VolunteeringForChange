package vfc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vfc.domain.Member;
import vfc.service.MemberService;

@Component
public class UsernameValidator implements ConstraintValidator<Username, String> {

	@Autowired
	private MemberService memberService;

	@Override
	public void initialize(Username arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String usrname, ConstraintValidatorContext arg1) {
		Member member;
		try {
			member = memberService.findMemberByUsername(usrname);
			if(member != null)
				return false;
		} catch (Exception e) {
		}
	return true;
	}

}
