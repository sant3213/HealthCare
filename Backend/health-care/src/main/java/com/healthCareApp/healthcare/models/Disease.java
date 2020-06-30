package com.healthCareApp.healthcare.models;

public class Disease extends Publication{
	
	private String id;
	private String name;
	
	public Disease() {
		super();
	}
	
	public Disease(String title, String description, String date, String speciality, String type_publication) {
		super(title, description, date, speciality, type_publication);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Disease [id=" + id + ", name=" + name + "]";
	}
}
