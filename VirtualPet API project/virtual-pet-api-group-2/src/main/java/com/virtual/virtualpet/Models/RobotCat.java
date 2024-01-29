package com.virtual.virtualpet.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RobotCat extends SuperPet {
    @ManyToOne
    @JoinColumn(name = "pet_shelter_id")
    private Shelter shelter;

    private String description;
    private boolean isWalking, doesHaveOil;

    public RobotCat() {

    }

    public Shelter getShelter() {
        return shelter;
    }

    public RobotCat(String name, String description, boolean isWalking, boolean doesHaveOil) {
        super(name);
        this.description = description;
        this.isWalking = isWalking;
        this.doesHaveOil = doesHaveOil;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean isWalking) {
        this.isWalking = isWalking;
    }

    public boolean isDoesHaveOil() {
        return doesHaveOil;
    }

    public void setDoesHaveOil(boolean doesHaveOil) {
        this.doesHaveOil = doesHaveOil;
    }

}
