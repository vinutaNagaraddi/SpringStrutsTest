package domain;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer personID;
	private String lastName;
	private String firstName;
	private String city;
	
	public Person(){
		
	}
	
	public Person(Integer personID, String lastName, String firstName, String city) {
		// TODO Auto-generated constructor stub
		this.personID = personID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.city = city;
	}
	public Integer getPersonID() {
		return personID;
	}
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", lastName=" + lastName
				+ ", firtName=" + firstName + ", City=" + city + "]";
	}
	
}
