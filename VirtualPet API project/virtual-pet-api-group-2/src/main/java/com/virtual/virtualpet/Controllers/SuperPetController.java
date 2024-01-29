package com.virtual.virtualpet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.SuperPet;
import com.virtual.virtualpet.Repositories.SuperPetRepo;

@RestController
@RequestMapping("/superpet")
public class SuperPetController {
    
    @Autowired
    private SuperPetRepo superPetRepo;
    
    @GetMapping("/{id}")
    public SuperPet getSuperPetById(@PathVariable long id){
        return superPetRepo.findById(id).orElse(null);
    }
}
