package com.example.practicaClase.persintence.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Assuming a separate unique identifier for database purposes

    @Column(nullable = false, unique = true)
    private int DNI;

    @Column(nullable = false)
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String email;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Property> properties = new ArrayList<>();

    // Constructor
    public Owner() {
    }

    public Owner(String name, String phoneNumber, String email, int DNI, List<Property> properties) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.DNI = DNI;
        this.properties = properties;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
        for (Property property : properties) {
            property.setOwner(this);  // Ensure back-reference is set
        }
    }

    // Method to add a property and automatically set the bidirectional relationship
    public void addProperty(Property property) {
        this.properties.add(property);
        property.setOwner(this);
    }
}
