package com.healthCareApp.healthcare.controllers;

import com.healthCareApp.healthcare.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * <h1>PatientController</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }
}
