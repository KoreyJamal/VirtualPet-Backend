package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.OrganicCat;
import com.virtual.virtualpet.Repositories.OrganicCatRepo;

@RestController
@RequestMapping("/organicCat")
public class OrganicCatController {
    @Autowired
    private OrganicCatRepo organicCatRepo;

    @PostMapping("/newOrganicCat")
    public OrganicCat addOrganicCat(@RequestBody OrganicCat organicCat){
        return organicCatRepo.save(organicCat);
    }

    @GetMapping("/name/{name}")
    public List<OrganicCat> getOrganicCatByName(@PathVariable String name){
        return organicCatRepo.findByName(name);
    }
    
    @GetMapping("{id}")
    public OrganicCat getOrganicCatById(@PathVariable long id){
        return organicCatRepo.findById(id).orElse(null);
    }
}
