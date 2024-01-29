package com.virtual.virtualpet.Repositories;

import com.virtual.virtualpet.Models.RobotCat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RobotCatRepo extends JpaRepository<RobotCat, Long> {
    List<RobotCat> findByName(String name);
}
