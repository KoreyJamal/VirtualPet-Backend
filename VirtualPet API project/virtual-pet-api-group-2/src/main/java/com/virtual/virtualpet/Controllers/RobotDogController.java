package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.RobotDog;
import com.virtual.virtualpet.Repositories.RobotDogRepo;

@RestController
@RequestMapping("/robotDog")
public class RobotDogController {
    @Autowired
    private RobotDogRepo robotDogRepo;

    @GetMapping("{id}")
    public RobotDog getRobotDogById(@PathVariable long id){
        return robotDogRepo.findById(id).orElse(null);
    }
    
    @GetMapping("/name/{name}")
    public List<RobotDog> getRobotDogByName(@PathVariable String name){
        return robotDogRepo.findByName(name);
    }
    
}
