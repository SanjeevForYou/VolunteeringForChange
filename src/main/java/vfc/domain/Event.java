package vfc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	private Date uploadDate;
	private Date updateDate;
	private int noOfSeats;
	private String location;
	private int ageCriteria;

	@ManyToOne(targetEntity = Category.class)
	@JoinColumn(name="category_id")
	List<Category> listOfCategory = new ArrayList<>();
	
	

	@ManyToMany
	@JoinTable(name = "interest", joinColumns = { @JoinColumn(name = "event_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	List<User> listOfUsers = new ArrayList<>();

	public Event() {
	}

	

	public List<User> getListOfUsers() {
		return listOfUsers;
	}


	public void setListOfUsers(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}


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

}
