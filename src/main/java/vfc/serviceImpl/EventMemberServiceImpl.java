package vfc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
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
	public EventMember saveEventMember(EventMember eventMember) {
		return eventMemberRepo.save(eventMember);
	}

}
