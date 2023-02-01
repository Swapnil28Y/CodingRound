package com.prospecta.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinalDTO {
	@JsonProperty("Title")
	private String title;
	@JsonProperty("Description")
	private String description;

	public FinalDTO() {
		super();
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public FinalDTO(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
}
