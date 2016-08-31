package vfc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import vfc.domain.Event;
import vfc.repository.CategoryManagementRepository;
import vfc.repository.EventManagementRepository;
import vfc.service.EventManagementService;

@Service
@Transactional
public class EventManagementServiceImpl implements EventManagementService {
	
	@Autowired
	private EventManagementRepository eventManagementRepository;

	@Override
	public void saveEvent(Event event) {
		// TODO Auto-generated method stub
		eventManagementRepository.save(event);
		
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventManagementRepository.findAll();
	}

	@Override
	public void deleteEvent(long eventId) {
		// TODO Auto-generated method stub
		eventManagementRepository.delete(eventId);
		
	}

	@Override
	public Event findEventById(long eventId) {
		// TODO Auto-generated method stub
		return eventManagementRepository.findOne(eventId);
	}

	@Override
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		eventManagementRepository.save(event);
		
	}
//
//	@Autowired
//	private EventManagementRepository eventManagementRepository;
//	
//	
//
//	
//	@Override
//	public void saveEvent(Event event) {
//		eventManagementRepository.save(event);
//	}
//
//
//
//
//	@Override
//	public List<Event> getAllEvents() {
//		// TODO Auto-generated method stub
//		return eventManagementRepository.findAll();
//	}
//
//
//
//
//	@Override
//	public void deleteEvent(long eventid) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//
//	@Override
//	public Event findEventById(long eventId) {
//		// TODO Auto-generated method stub
//		return eventManagementRepository;
//	}
//
//
//
//
//	@Override
//	public void updateEvent(Event event) {
//		// TODO Auto-generated method stub
//		
//	}




	
	

	
	
	

}
