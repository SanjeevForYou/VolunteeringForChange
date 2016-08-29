package vfc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vfc.domain.Event;
import vfc.repository.EventManagementRepository;
import vfc.service.EventManagementService;

@Service
@Transactional
public class EventManagementServiceImpl implements EventManagementService {

	@Autowired
	private EventManagementRepository eventManageRepo;
	@Override
	public Event saveEvent(Event event) {
		return eventManageRepo.save(event);
	}

	@Override
	public List<Event> getAllEvents() {
		return (List<Event>) eventManageRepo.findAll();
	}

	@Override
	public void deleteEvent(int eventid) {
		eventManageRepo.delete(eventid);
		
	}

}
