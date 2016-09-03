package vfc.domain;

import java.util.ArrayList;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "MEMBER")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;

	@NotEmpty
	@Size(min = 4, max = 20, message="{register.member.name.size}")
	@Column(name = "FIRSTNAME")
	private String firstName;

	@NotEmpty
	@Size(min = 4, max = 20,message="{register.member.name.size}")
	@Column(name = "LASTNAME")
	private String lastName;

	@NotNull
	@Column(name = "DOB")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(name = "AGE")
	private int age;

	@Column(name = "TITLE")
	private String title;
	@Column(name = "MEMBERNUMBER")
	private int memberNumber;
	
	private int mark;

	public int getMark() {
		return mark;
	}



	public void setMark(int mark) {
		this.mark = mark;
	}

	@Valid
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "USERNAME")
	private Credentials credentials;
	
	@JsonIgnore
	@OneToMany(mappedBy = "member")
	private List<EventMember> listOfEventMembers = new ArrayList<>();

	public Member() {
	}
	
	

	public List<EventMember> getListOfEventMembers() {
		return listOfEventMembers;
	}



	public void setListOfEventMembers(List<EventMember> listOfEventMembers) {
		this.listOfEventMembers = listOfEventMembers;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFullName(){
		return getFirstName()+" "+getLastName();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + ", title=" + title + ", memberNumber=" + memberNumber
				+ ", credentials=" + credentials + "]";
	}

}
