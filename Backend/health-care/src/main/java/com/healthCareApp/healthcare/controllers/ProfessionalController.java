package com.healthCareApp.healthcare.controllers;

import com.healthCareApp.healthcare.services.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * <h1>ProfessionalController</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Controller
@RequestMapping("/professional")
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    public ProfessionalController(ProfessionalService professionalService){
        this.professionalService = professionalService;
    }

}
