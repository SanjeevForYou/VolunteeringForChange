package vfc.service;

import java.util.List;

import vfc.domain.Event;

public interface EventManagementService {
	
	public Event saveEvent(Event event);
	public List<Event> getAllEvents();
	public void deleteEvent(int eventid);

}
