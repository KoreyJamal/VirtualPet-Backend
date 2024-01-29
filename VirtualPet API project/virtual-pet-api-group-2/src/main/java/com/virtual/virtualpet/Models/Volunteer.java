package com.virtual.virtualpet.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int collectionOfShelters;

    public Volunteer() {
        this.shelters = new ArrayList<>();
    }

    public Volunteer(String name, int collectionOfShelters) {
        this.name = name;
        this.collectionOfShelters = collectionOfShelters;
    }

    @ManyToMany
    @JoinTable(name = "shelter_volunteer", joinColumns = @JoinColumn(name = "volunteer_id"), inverseJoinColumns = @JoinColumn(name = "shelter_id"))
    private List<Shelter> shelters = new ArrayList<>();

    public long getId() {
        return id;
    }

    public List<Shelter> getShelter() {
        return shelters;
    }

    public void setShelter(List<Shelter> shelter) {
        this.shelters = shelter;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getCollectionOfShelters() {
        return collectionOfShelters;
    }

    public void setCollectionOfShelters(int collectionOfShelters) {
        this.collectionOfShelters = collectionOfShelters;
    }

    public List<Shelter> getShelters() {
        return shelters;
    }

    public void setShelters(List<Shelter> shelters) {
        this.shelters = shelters;
    }

    public void setName(String name) {
        this.name = name;
    }

}
