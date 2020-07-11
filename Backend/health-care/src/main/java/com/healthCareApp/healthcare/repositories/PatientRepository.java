package com.healthCareApp.healthcare.repositories;

import com.healthCareApp.healthcare.models.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/*
 * <h1>PatientRepository</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Repository
public interface PatientRepository extends CrudRepository<Patient, UUID> {
}
