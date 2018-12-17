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
	private String name;
	private String guestName;
	private boolean isAttending;
	private String email;
	private int mealSelection;
	private String message;
	
	public Attendee() {
		
	}
	
	public Attendee(
		String name,
		String guestName,
		boolean isAttending,	
		String email, 
		int mealSelection, 
		String message
	) {
		this.name = name;
		this.guestName = guestName;
		this.isAttending = isAttending;
		this.email = email;
		this.mealSelection = mealSelection;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGuestName() {
		return guestName;
	}
	
	public void setGuestName(String guestName) {
		this.guestName = guestName;
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
		return "Attendee [name=" + name + ", guestName=" + guestName + ", isAttending=" + isAttending + ", email="
				+ email + ", mealSelection=" + mealSelection + ", message=" + message + "]";
	}
}
