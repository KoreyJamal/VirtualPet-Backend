package com.virtual.virtualpet.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.Shelter;

public interface ShelterRepo extends JpaRepository<Shelter, Long>{
    List<Shelter> findByName(String name);
    
}
