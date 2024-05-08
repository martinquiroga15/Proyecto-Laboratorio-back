package com.example.practicaClase.persintence.entities;

import jakarta.persistence.*;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Auto-generated ID for database primary key

    @Column(nullable = false)
    private String address;  // Non-nullable column in the database

    @Column
    private double area;  // A column to store the area of the property

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner; // Association with Owner, using a foreign key

    // Constructor without parameters
    public Property() {
    }

    // Constructor with parameters
    public Property(String address, double area, Owner owner) {
        this.address = address;
        this.area = area;
        this.owner = owner;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
        if (!owner.getProperties().contains(this)) {
            owner.getProperties().add(this);
        }
    }
}
