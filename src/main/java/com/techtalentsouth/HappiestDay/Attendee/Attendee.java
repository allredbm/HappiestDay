package com.techtalentsouth.HappiestDay.Attendee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String guestFirstName;
	private String guestLastName;
	private boolean isAttending;
	private String email;
	private int mealSelection;
	private String message;
	
	public Attendee() {
		
	}
	
	public Attendee(
		String firstName, 
		String lastName, 
		String guestFirstName, 
		String guestLastName, 
		boolean isAttending,	
		String email, 
		int mealSelection, 
		String message
	) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.guestFirstName = guestFirstName;
		this.guestLastName = guestLastName;
		this.isAttending = isAttending;
		this.email = email;
		this.mealSelection = mealSelection;
		this.message = message;
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
	
	public String getGuestFirstName() {
		return guestFirstName;
	}
	
	public void setGuestFirstName(String guestFirstName) {
		this.guestFirstName = guestFirstName;
	}
	
	public String getGuestLastName() {
		return guestLastName;
	}
	
	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}
	
	public boolean isAttending() {
		return isAttending;
	}
	
	public void setAttending(boolean isAttending) {
		this.isAttending = isAttending;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMealSelection() {
		return mealSelection;
	}
	
	public void setMealSelection(int mealSelection) {
		this.mealSelection = mealSelection;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Attendee [firstName=" + firstName + ", lastName=" + lastName + ", guestFirstName=" + guestFirstName
				+ ", guestLastName=" + guestLastName + ", isAttending=" + isAttending + ", email=" + email
				+ ", mealSelection=" + mealSelection + ", message=" + message + "]";
	}
}
