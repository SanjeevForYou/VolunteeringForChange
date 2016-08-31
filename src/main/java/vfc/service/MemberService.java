package vfc.service;

import java.util.List;

import vfc.domain.Member;

public interface MemberService {

	public void save(Member member);
	public List<Member> findAll();
	public Member findByMemberNumber(int memberId);
  	public void saveFull( Member member); 
  	public Member findMemberByUsername(String username);
  	
  	public List<Member> findMembersByEventId(int eventId);
}
