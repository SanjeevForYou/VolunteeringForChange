package vfc.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eventId")
	private int eventId;
	private String title;
	private String shortDescription;
	private String description;
	private byte[] image;
	@Temporal(TemporalType.DATE)
	private Date uploadDate;
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private int noOfSeats;
	private String location;
	private int ageCriteria;
	private int status;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	/*@ManyToMany
	@JoinTable(name = "interest", joinColumns = { @JoinColumn(name = "event_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	List<Member> listOfUsers = new ArrayList<>();*/
	
	@OneToMany(mappedBy = "event", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<EventMember> listOfEventMembers = new ArrayList<>();

	
	public Event() {
	}

	
	public List<EventMember> getListOfEventMembers() {
		return listOfEventMembers;
	}


	public void setListOfEventMembers(List<EventMember> listOfEventMembers) {
		this.listOfEventMembers = listOfEventMembers;
	}


	public Date getStartDate() {
		return startDate;
	}
	

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	/*public List<Member> getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(List<Member> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}*/

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAgeCriteria() {
		return ageCriteria;
	}

	public void setAgeCriteria(int ageCriteria) {
		this.ageCriteria = ageCriteria;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Event [title=" + title + "]";
	}

	
	

}
