package com.healthCareApp.healthcare.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient extends User{

    @Column(name = "diet")
    private String diet;

    @Column(name = "diseases")
    private String diseases;

    @Column(name = "age")
    private String age;

    @Column(name = "weight")
    private String weight;

    @Column(name = "physical_activity")
    private String physicalActivity;

    public Patient(String diet, String diseases, String age, String weight, String physicalActivity){
        super();
        this.diet = diet;
        this.diseases = diseases;
        this.age = age;
        this.weight = weight;
        this.physicalActivity = physicalActivity;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPhysicalActivity() {
        return physicalActivity;
    }

    public void setPhysicalActivity(String physicalActivity) {
        this.physicalActivity = physicalActivity;
    }
}
