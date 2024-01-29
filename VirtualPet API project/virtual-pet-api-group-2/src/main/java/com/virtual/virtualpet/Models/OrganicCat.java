package com.virtual.virtualpet.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class OrganicCat extends SuperPet {
    @ManyToOne
    @JoinColumn(name = "pet_shelter_id")
    private Shelter shelter;

    private String description;
    private int hunger, thirst;
    private boolean isWalking, isCatClean;

    public OrganicCat() {

    }

    public OrganicCat(String name, String description, int hunger, int thirst, boolean isWalking,
            boolean isCatClean) {
        super(name);
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.isWalking = isWalking;
        this.isCatClean = isCatClean;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean isWalking) {
        this.isWalking = isWalking;
    }

    public boolean isCatClean() {
        return isCatClean;
    }

    public void setCatClean(boolean isCatClean) {
        this.isCatClean = isCatClean;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

}
