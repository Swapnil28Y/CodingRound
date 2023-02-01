package com.prospecta.Exceptions;

import java.time.LocalTime;

public class AllErrorDetails {
	private LocalTime localTime;
	private String message;
	private String description;

	
	public AllErrorDetails() {
		super();
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AllErrorDetails(LocalTime localTime, String message, String description) {
		super();
		this.localTime = localTime;
		this.message = message;
		this.description = description;
	}
	

}
