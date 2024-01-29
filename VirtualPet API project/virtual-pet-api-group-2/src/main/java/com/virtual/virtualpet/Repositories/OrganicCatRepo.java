package com.virtual.virtualpet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.OrganicCat;
import java.util.List;


public interface OrganicCatRepo extends JpaRepository<OrganicCat, Long>{
    List<OrganicCat> findByName(String name);
}
