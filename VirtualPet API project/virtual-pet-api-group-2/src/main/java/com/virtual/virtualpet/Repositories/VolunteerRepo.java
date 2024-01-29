package com.virtual.virtualpet.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.Volunteer;

public interface VolunteerRepo extends JpaRepository<Volunteer, Long>{
    List<Volunteer> findByName(String name);
    
}
