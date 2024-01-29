package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.OrganicDog;
import com.virtual.virtualpet.Repositories.OrganicDogRepo;

@RestController
@RequestMapping("/organicDog")
public class OrganicDogController {
    @Autowired
    private OrganicDogRepo organicDogRepo;

    @GetMapping("/name/{name}")
    public List<OrganicDog> getOrganicDogByName(@PathVariable String name) {
        return organicDogRepo.findByName(name);
    }

    @GetMapping("{id}")
    public OrganicDog getOrganicDogById(@PathVariable long id) {
        return organicDogRepo.findById(id).orElse(null);
    }

}
