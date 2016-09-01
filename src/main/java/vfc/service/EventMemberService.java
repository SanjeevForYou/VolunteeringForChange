package vfc.service;

import vfc.domain.EventMember;

public interface EventMemberService {
	public EventMember saveEventMember(EventMember eventMember);
	
	public boolean isUserEventExist(int eventid, int userid);
}
