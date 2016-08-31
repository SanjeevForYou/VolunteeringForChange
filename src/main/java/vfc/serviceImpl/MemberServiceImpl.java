package vfc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vfc.domain.Member;
import vfc.repository.MemberRepository;
import vfc.service.CredentialsService;
import vfc.service.MemberService;

@Service
@Transactional 
public class MemberServiceImpl implements MemberService {
	
 	@Autowired
	private MemberRepository memberRepository;

 	@Autowired
 	CredentialsService credentialsService;

  	public void saveFull( Member member) {  		
  		credentialsService.save(member.getCredentials());
  		memberRepository.save(member);
	}
  	
  	public void save( Member member) {  		
  		memberRepository.save(member);
  		credentialsService.save(member.getCredentials());
 	}
  	
  	
	public List<Member> findAll() {
		return (List< Member>)memberRepository.findAll();
	}

	public Member findByMemberNumber(int memberId) {
		return memberRepository.findByMemberNumber(memberId);
	}

	@Override
	public Member findMemberByUsername(String username) {
		return memberRepository.findMemberByUsername(username);
	}

	
	@Override
	public List<Member> findMembersByEventId(int eventId) {
		List<Member> members = memberRepository.findMembersByEventId(eventId);
		//System.out.println(members);
		return members;
	}
 

}
