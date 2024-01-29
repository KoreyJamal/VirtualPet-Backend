package com.virtual.virtualpet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.SuperPet;

public interface SuperPetRepo extends JpaRepository<SuperPet, Long>{
    
}
