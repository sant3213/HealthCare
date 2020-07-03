package com.healthCareApp.healthcare.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "comments")
public class Comments extends Query{

	@Id
	@GeneratedValue
	private UUID professional_id;

	@Column(name="professional_name")
	private String professional_name;
	
	public Comments() {
		super();
	}

	public Comments(String title, String description, String date, String speciality, String type_publication) {
		super(title, description, date, speciality, type_publication);
	}

	public UUID getProfessional_id() {
		return professional_id;
	}

	public void setProfessional_id(UUID professional_id) {
		this.professional_id = professional_id;
	}

	public String getProfessional_name() {
		return professional_name;
	}

	public void setProfessional_name(String professional_name) {
		this.professional_name = professional_name;
	}

	@Override
	public String toString() {
		return "Comments{" +
				"professional_id=" + professional_id +
				", professional_name='" + professional_name + '\'' +
				'}';
	}
}
