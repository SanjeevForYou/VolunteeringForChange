package vfc.service;

import java.util.List;

import org.springframework.stereotype.Service;


import vfc.domain.Event;
@Service
public interface EventManagementService {
	
	public void saveEvent(Event event);
	public List<Event> getAllEvents();
	public void deleteEvent(long eventId);
	public Event findEventById(long eventId);
	public void updateEvent(Event event);
	
	
	
	

}
