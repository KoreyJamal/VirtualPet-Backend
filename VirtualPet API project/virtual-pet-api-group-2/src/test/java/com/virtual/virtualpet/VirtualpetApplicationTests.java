package com.virtual.virtualpet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtual.virtualpet.Controllers.OrganicCatController;
import com.virtual.virtualpet.Controllers.OrganicDogController;
import com.virtual.virtualpet.Controllers.RobotCatController;
import com.virtual.virtualpet.Controllers.RobotDogController;
import com.virtual.virtualpet.Controllers.VolunteerController;
import com.virtual.virtualpet.Models.OrganicCat;
import com.virtual.virtualpet.Models.OrganicDog;
import com.virtual.virtualpet.Models.RobotCat;
import com.virtual.virtualpet.Models.RobotDog;
import com.virtual.virtualpet.Models.Volunteer;
import com.virtual.virtualpet.Repositories.VolunteerRepo;

@SpringBootTest
class VirtualpetApplicationTests {

	@Autowired
	private OrganicCatController organicCatController;

	@Autowired
	private OrganicDogController organicDogController;

	@Autowired
	private RobotCatController robotCatController;

	@Autowired
	private RobotDogController robotDogController;

	@Autowired
	private VolunteerController volunteerController;

	@Test
	public void testGetOrganicCatByName() {
		List<OrganicCat> result = organicCatController.getOrganicCatByName("Zatter");
		assertEquals("Zatter", result.get(0).getName(), "Name is not available");
	}

	@Test
	public void testGetOrganicCatById() {
		OrganicCat result = organicCatController.getOrganicCatById(1);
		assertEquals("Zatter", result.getName(), "Organic Cat is not found");
	}

	@Test
	public void testAddOrganicCat() {
		OrganicCat organicCatTest = new OrganicCat("TestCat", "this cat is not real ", 5, 3, false, true);
		OrganicCat result = organicCatController.addOrganicCat(organicCatTest);
		assertEquals(organicCatTest.getName(), result.getName(), "Cat is same as we sent it to the method");
	}

	@Test
	public void testOrganicDogById() {
		OrganicDog result = organicDogController.getOrganicDogById(1);
		assertEquals(1, result.getId(), "Organic cat is not found");
	}

	@Test
	public void testGetOrganicDogByName() {
		List<OrganicDog> result = organicDogController.getOrganicDogByName("Caramella");
		assertEquals("Caramella", result.get(0).getName(), "Dog is not the same");
	}

	@Test
	public void testGetRobotCatByName() {
		List<RobotCat> result = robotCatController.getRobotCatByName("Meaw");
		assertEquals("Meaw", result.get(0).getName(), "Robotic cat is not the same");
	}

	@Test
	public void testGetRobotCatById() {
		RobotCat result = robotCatController.getRobotCatById(1);
		assertEquals(1, result.getId(), "Robot Cat id not found");
	}

	@Test
	public void testGetRobotDogById() {
		RobotDog result = robotDogController.getRobotDogById(1);
		assertEquals("Robo", result.getName(), "Robot Dog is not found");
		assertEquals(1, result.getId(), "Robo Dog ID not the same");
	}

	@Test
	public void testGetRobotDogByName() {
		List<RobotDog> result = robotDogController.getRobotDogByName("Robo");
		assertEquals("Robo", result.get(0).getName(), "Robo is not existed ");
	}

	@Test
	public void testAddVolunteer() {
		Volunteer volunteerTest1 = new Volunteer("Rayan", 2);
		Volunteer result = volunteerController.addVolunteer(volunteerTest1);
		assertEquals("Rayan", result.getName(), "Volunteer Rayan not found");
		assertEquals(2, result.getId(), "Id is not found");
	}

	// You need to run all the tests to pass this one as its depending on previous
	// value
    @Test
	public void testGetVolunteerByName() {
		List<Volunteer> result = volunteerController.getVolunteerByName("Rayan");
		assertEquals(2, result.get(0).getCollectionOfShelters(), "Rayan doesn't have collection of shelters");
	}

	@Autowired
	private VolunteerRepo volunteerRepo;

	@Test
	public void testGetVolunteerById() {
		Volunteer volunteerTest2 = new Volunteer();
		volunteerRepo.save(volunteerTest2);
		Volunteer result = volunteerController.getVolunteerById(1);
		assertEquals(1, result.getId(), "Id is not found");
	}

}
