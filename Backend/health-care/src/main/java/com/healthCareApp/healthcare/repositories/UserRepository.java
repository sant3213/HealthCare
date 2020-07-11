package com.healthCareApp.healthcare.repositories;

import com.healthCareApp.healthcare.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/*
 * <h1>UserRepository</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
