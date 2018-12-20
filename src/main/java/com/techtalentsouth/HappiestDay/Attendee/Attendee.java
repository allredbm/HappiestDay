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
	private String message;
	
	public Attendee() {
		
	}
	
	public Attendee(
		String name,
		String guestName,
		boolean isAttending,	
		String email, 
		String message
	) {
		this.name = name;
		this.guestName = guestName;
		this.isAttending = isAttending;
		this.email = email;
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
	
	public boolean getIsAttending() {
		return isAttending;
	}
	
	public void setIsAttending(boolean isAttending) {
		this.isAttending = isAttending;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
				+ email + ", message=" + message + "]";
	}
}

