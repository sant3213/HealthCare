package com.healthCareApp.healthcare.models;

import javax.persistence.*;
import java.util.UUID;
/*
 * <h1>Patient</h1>
 * Patient extends from User class
 * @see com.healthCareApp.healthcare.models.User
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name="name")
    private String name;

    public Specialty(String name){
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
