package com.healthCareApp.healthcare.models;

import javax.persistence.*;
import java.util.UUID;

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
