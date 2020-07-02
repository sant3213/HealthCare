package com.healthCareApp.healthcare.models;

import javax.persistence.*;

@Entity
@Table(name="professional")
public class Professional extends User{

    @Column(name = "experience_time")
    private String experienceTime;

    @Column(name = "professional_card")
    private String professionalCard;

    @ManyToOne
    @JoinColumn(name = "professional_id")
    private Specialty specialty;

    public Professional(String experienceTime, String professionalCard){
        super();
        this.experienceTime = experienceTime;
        this.professionalCard = professionalCard;
    }

    public String getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(String experienceTime) {
        this.experienceTime = experienceTime;
    }

    public String getProfessionalCard() {
        return professionalCard;
    }

    public void setProfessionalCard(String professionalCard) {
        this.professionalCard = professionalCard;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
