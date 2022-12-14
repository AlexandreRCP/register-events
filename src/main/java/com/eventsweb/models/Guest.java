package com.eventsweb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Guest {

	@Id
	private String rg;
	private String nameGuest;
	
	@ManyToOne
	private Event event;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNameGuest() {
		return nameGuest;
	}
	public void setNameGuest(String nameGuest) {
		this.nameGuest = nameGuest;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
}
