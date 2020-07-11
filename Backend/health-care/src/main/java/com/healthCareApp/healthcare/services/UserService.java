package com.healthCareApp.healthcare.services;

import com.healthCareApp.healthcare.implementations.UserImplementation;
import com.healthCareApp.healthcare.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
 * <h1>UserService</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Service
public class UserService implements UserImplementation {

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public Object findById(UUID id) {
        return null;
    }
}
