package com.virtual.virtualpet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.OrganicDog;
import java.util.List;

public interface OrganicDogRepo extends JpaRepository<OrganicDog, Long> {
    List<OrganicDog> findByName(String name);
}
