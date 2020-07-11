package com.healthCareApp.healthcare.dto;

/*
 * <h1>PatientDto</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
public class PatientDto {

    private String diet;

    private String diseases;

    private String age;

    private String weight;

    private String physicalActivity;

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
