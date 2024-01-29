package com.virtual.virtualpet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.virtualpet.Models.RobotCat;
import com.virtual.virtualpet.Repositories.RobotCatRepo;

@RestController
@RequestMapping("/robotCat")
public class RobotCatController {
    @Autowired
    private RobotCatRepo robotCatRepo;

    @GetMapping("/name/{name}")
    public List<RobotCat> getRobotCatByName(@PathVariable String name) {
        return robotCatRepo.findByName(name);
    }

    @GetMapping("{id}")
    public RobotCat getRobotCatById(@PathVariable long id) {
        return robotCatRepo.findById(id).orElse(null);
    }

}
