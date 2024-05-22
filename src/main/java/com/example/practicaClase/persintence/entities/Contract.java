package com.example.practicaClase.persintence.entities;

import com.example.practicaClase.persintence.entities.Event;
import com.example.practicaClase.persintence.entities.Property;
import com.example.practicaClase.persintence.entities.Tenant;
import jakarta.persistence.Entity;

@Entity
public class Contract extends Event {

    private String endDate;

    // Constructors, Getters, Setters

    public Contract() {
    }

    public Contract(String date, Tenant tenant, Property property, String endDate) {
        super(date, tenant, property);
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
