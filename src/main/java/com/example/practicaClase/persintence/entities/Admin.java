package com.example.practicaClase.persintence.entities;

import com.example.practicaClase.persintence.entities.Landlord;
import com.example.practicaClase.persintence.entities.Owner;

import com.example.practicaClase.persintence.entities.User;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<Owner> ownerList;

    @OneToMany(mappedBy = "admin")
    private List<Landlord> landlordList;

    // Getters and Setters

    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }

    public List<Landlord> getLandlordList() {
        return landlordList;
    }

    public void setLandlordList(List<Landlord> landlordList) {
        this.landlordList = landlordList;
    }
}
