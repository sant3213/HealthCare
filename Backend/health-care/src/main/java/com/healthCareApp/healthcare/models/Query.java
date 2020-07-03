package com.healthCareApp.healthcare.models;

import javax.persistence.*;

@Entity
@Table(name="query")
public class Query extends Publication {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "user_id")
	private int user_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public Query() {
		super();
	}
	
	public Query(String title, String description, String date, String speciality, String type_publication) {
		super(title, description, date, speciality, type_publication);
	}
	
	@Override
	public String toString() {
		return "Query [id=" + id + ", user_id=" + user_id + "]";
	}
}
