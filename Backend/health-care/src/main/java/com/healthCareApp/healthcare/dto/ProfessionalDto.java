package com.healthCareApp.healthcare.dto;

import com.healthCareApp.healthcare.models.Specialty;
/*
 * <h1>ProfessionalDto</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
public class ProfessionalDto {

    private String experienceTime;

    private String professionalCard;

    private Specialty specialty;

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
