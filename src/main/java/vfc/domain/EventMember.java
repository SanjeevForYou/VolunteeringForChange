package vfc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EventMember {
	
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member; 
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;
	
	private int approval;
	

	
	public EventMember() {
		
	}

	public Member getMember() {
		return member;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	public int getApproval() {
		return approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}


}
