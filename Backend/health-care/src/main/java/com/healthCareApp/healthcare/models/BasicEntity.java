package com.healthCareApp.healthcare.models;

import com.healthCareApp.healthcare.dto.Dto;
import org.springframework.beans.BeanUtils;

/*
* @author Santiago Cárdenas
* @version 1.0
* @since 2020
* */

public abstract class BasicEntity<T extends Dto> {

    public abstract T getDTO();

    public BasicEntity() {

    }

    public BasicEntity(T dto) {
        BeanUtils.copyProperties(dto, this);
    }

}
