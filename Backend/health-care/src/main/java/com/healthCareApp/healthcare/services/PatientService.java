package com.healthCareApp.healthcare.services;

import com.healthCareApp.healthcare.models.User;
import com.healthCareApp.healthcare.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
/*
 * <h1>PatientService</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Service
public class PatientService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User userInput){
        try {
            userRepository.save(userInput);
        } catch (DataAccessException ex){
            System.out.println(ex);
        }
    }
}
