package com.healthCareApp.healthcare.models;

public class Publication {
	
	private String title;
	private String description;
	private String date;
	private String speciality;
	private String type_publication;
	
	public Publication () {
		
	}
	
	public Publication(String title, String description, String date, String speciality, String type_publication) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.speciality = speciality;
		this.type_publication = type_publication;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getType_publication() {
		return type_publication;
	}
	public void setType_publication(String type_publication) {
		this.type_publication = type_publication;
	}
	
	@Override
	public String toString() {
		return "Publication [title=" + title + ", description=" + description + ", date=" + date + ", speciality="
				+ speciality + ", type_publication=" + type_publication + "]";
	}

}
