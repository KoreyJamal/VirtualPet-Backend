package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.Shelter;
import com.virtual.virtualpet.Repositories.ShelterRepo;

@RestController
@RequestMapping("/shelter")
public class ShelterController {
    @Autowired
    private ShelterRepo shelterRepo;

    @GetMapping("/{id}")
    public Shelter getShelterRepoById(@PathVariable long id) {
        return shelterRepo.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<Shelter> getShelterByName(@PathVariable String name){
        return shelterRepo.findByName(name);
    }

    @PostMapping("/newShelter")
    Shelter newShelter(@RequestBody Shelter newShelter){
        return shelterRepo.save(newShelter);
    }
}
