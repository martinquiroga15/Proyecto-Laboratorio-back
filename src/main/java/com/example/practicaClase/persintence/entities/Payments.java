package com.example.practicaClase.persintence.entities;

import com.example.practicaClase.persintence.entities.Event;
import com.example.practicaClase.persintence.entities.Property;
import com.example.practicaClase.persintence.entities.Tenant;
import jakarta.persistence.Entity;

@Entity
public class Payments extends Event {

    private Double amount;

    // Constructors, Getters, Setters

    public Payments() {
    }

    public Payments(String date, Tenant tenant, Property property, Double amount) {
        super(date, tenant, property);
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
