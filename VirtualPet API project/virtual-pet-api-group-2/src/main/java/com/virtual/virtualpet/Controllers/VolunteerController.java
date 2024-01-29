package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.Volunteer;
import com.virtual.virtualpet.Repositories.VolunteerRepo;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
    @Autowired
    private VolunteerRepo volunteerRepo;

    @PostMapping("/newVolunteer")
    public Volunteer addVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerRepo.save(volunteer);
    }

    @GetMapping("/name/{name}")
    public List<Volunteer> getVolunteerByName(@PathVariable String name) {
        return volunteerRepo.findByName(name);
    }

    @GetMapping("{id}")
    public Volunteer getVolunteerById(@PathVariable long id) {
        return volunteerRepo.findById(id).orElse(null);
    }

}
