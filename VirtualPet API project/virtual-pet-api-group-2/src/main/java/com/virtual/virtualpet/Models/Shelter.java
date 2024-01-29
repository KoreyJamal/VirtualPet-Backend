package com.virtual.virtualpet.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Shelter() {
    }

    public Shelter(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "shelter")
    private List<OrganicCat> organicCats = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<OrganicDog> organicDogs = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<RobotCat> robotCats = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<RobotDog> robotDogs = new ArrayList<>();

    @ManyToMany(mappedBy = "shelters")
    private List<Volunteer> volunteer = new ArrayList<>();

}
