package com.healthCareApp.healthcare.repositories;

import com.healthCareApp.healthcare.models.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/*
 * <h1>ProfessionalRepository</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, UUID> {
}
