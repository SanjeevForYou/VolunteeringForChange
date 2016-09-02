package vfc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vfc.domain.EventMember;
import vfc.repository.EventMemberRepository;
import vfc.service.EventMemberService;

@Service
@Transactional
public class EventMemberServiceImpl implements EventMemberService {

	@Autowired
	EventMemberRepository eventMemberRepo;
	
	
	@Override
    @PreAuthorize("hasRole('ROLE_USER') AND hasRole('ROLE_ADMIN')")
	public EventMember saveEventMember(EventMember eventMember) {
		return eventMemberRepo.save(eventMember);
	}
	@Override
	public boolean isUserEventExist(int eventid, int userid) {
		// TODO Auto-generated method stub
		return eventMemberRepo.isUserEventExist(eventid,userid).size()==0?true:false;
	}

}
