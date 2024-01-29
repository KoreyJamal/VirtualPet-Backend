package com.virtual.virtualpet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.virtualpet.Models.RobotDog;
import java.util.List;


public interface RobotDogRepo extends JpaRepository<RobotDog, Long>{
    List<RobotDog> findByName(String name);
    
}
