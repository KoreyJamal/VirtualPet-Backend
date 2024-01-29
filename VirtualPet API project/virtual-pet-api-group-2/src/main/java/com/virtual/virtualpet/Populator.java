package com.virtual.virtualpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtual.virtualpet.Models.OrganicCat;
import com.virtual.virtualpet.Models.OrganicDog;
import com.virtual.virtualpet.Models.RobotCat;
import com.virtual.virtualpet.Models.RobotDog;
import com.virtual.virtualpet.Models.Shelter;
import com.virtual.virtualpet.Repositories.OrganicCatRepo;
import com.virtual.virtualpet.Repositories.OrganicDogRepo;
import com.virtual.virtualpet.Repositories.RobotCatRepo;
import com.virtual.virtualpet.Repositories.RobotDogRepo;
import com.virtual.virtualpet.Repositories.ShelterRepo;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private ShelterRepo shelterRepo;

    @Autowired
    private OrganicDogRepo organicDogRepo;

    @Autowired
    private OrganicCatRepo organicCatRepo;

    @Autowired
    private RobotCatRepo robotCatRepo;

    @Autowired
    private RobotDogRepo robotDogRepo;

    @Override
    public void run(String... args) throws Exception {
        Shelter shelter1 = new Shelter("First");
        shelterRepo.save(shelter1);

        OrganicDog dog1 = new OrganicDog("Caramella", "love play", 8, 9, true, true);
        dog1.setShelter(shelter1);
        organicDogRepo.save(dog1);
        

        OrganicCat Cat1 = new OrganicCat("Zatter", "Doesn't care about anyone", 4, 5, true, true);
        Cat1.setShelter(shelter1);
        organicCatRepo.save(Cat1);

        RobotCat roboCat1 = new RobotCat("Meaw", "Its stronger than any other cat", true, false);
        roboCat1.setShelter(shelter1);
        robotCatRepo.save(roboCat1);

        RobotDog roboDog1 = new RobotDog("Robo", "Jumps really high", false, true);
        roboDog1.setShelter(shelter1);
        robotDogRepo.save(roboDog1);
    }

}
