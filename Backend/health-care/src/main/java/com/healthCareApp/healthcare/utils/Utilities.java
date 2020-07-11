package com.healthCareApp.healthcare.utils;

import com.healthCareApp.healthcare.dto.Dto;
import com.healthCareApp.healthcare.models.BasicEntity;

import java.util.ArrayList;
import java.util.List;
/*
 * <h1>Utilities</h1>
 * @author Santiago Cárdenas
 * @version 1.0
 * @since 2020
 * */
public abstract class Utilities {

    public static <T extends Dto> List<T> convertEntityListToDTO(List<? extends BasicEntity<? extends T>> entities) {
        List<T> dtos = new ArrayList<>();
        for (BasicEntity<? extends T> entity : entities) {
            dtos.add(entity.getDTO());
        }
        return dtos;
    }

}
