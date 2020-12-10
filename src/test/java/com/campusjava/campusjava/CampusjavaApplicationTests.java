package com.campusjava.campusjava;

import com.campusjava.campusjava.model.Vehicule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CampusjavaApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetAllVehicules() {

		String testGetAllVehicules = "[{\"id\":1,\"brand\":\"Ferrari\",\"modele\":\"Italia\",\"color\":\"red\"},{\"id\":2,\"brand\":\"Ferrari\",\"modele\":\"Enerve\",\"color\":\"blue\"},{\"id\":3,\"brand\":\"Ferrari\",\"modele\":\"Defonce\",\"color\":\"yellow\"}]";
		String allVehicules = this.restTemplate.getForObject("/vehicules", String.class);
		assertEquals(allVehicules, testGetAllVehicules);

		String testAddVehicules = "[{\"id\":1,\"brand\":\"Ferrari\",\"modele\":\"Italia\",\"color\":\"red\"},{\"id\":2,\"brand\":\"Ferrari\",\"modele\":\"Enerve\",\"color\":\"blue\"},{\"id\":3,\"brand\":\"Ferrari\",\"modele\":\"Defonce\",\"color\":\"yellow\"},{\"id\":4,\"brand\":\"PEUGEOT\",\"modele\":\"308\",\"color\":\"BLANC\"}]";
		Vehicule newVehicule = new Vehicule(4, "PEUGEOT", "308", "BLANC");
		this.restTemplate.postForObject("/vehicules", newVehicule, String.class);
		String getAddVehicules = this.restTemplate.getForObject("/vehicules", String.class);
		assertEquals(getAddVehicules, testAddVehicules);

		String testgetOneVehicule = "{\"id\":2,\"brand\":\"Ferrari\",\"modele\":\"Enerve\",\"color\":\"blue\"}";
		String oneVehicule = this.restTemplate.getForObject("/vehicules/2", String.class);
		assertEquals(oneVehicule, testgetOneVehicule);

		String testUpdateOneVehicule = "[{\"id\":1,\"brand\":\"Ferrari\",\"modele\":\"Italia\",\"color\":\"red\"},{\"id\":2,\"brand\":\"MAZERATI\",\"modele\":\"ECLATE\",\"color\":\"GRIS\"},{\"id\":3,\"brand\":\"Ferrari\",\"modele\":\"Defonce\",\"color\":\"yellow\"},{\"id\":4,\"brand\":\"PEUGEOT\",\"modele\":\"308\",\"color\":\"BLANC\"}]";
		Vehicule updateVehicule = new Vehicule(2, "MAZERATI", "ECLATE", "GRIS");
		this.restTemplate.put("/vehicules/2", updateVehicule, String.class);
		String updatedVehicule = this.restTemplate.getForObject("/vehicules", String.class);
		assertEquals(updatedVehicule, testUpdateOneVehicule);
		System.out.println(updatedVehicule);

		String testDeleteOneVehicule = "[{\"id\":1,\"brand\":\"Ferrari\",\"modele\":\"Italia\",\"color\":\"red\"},{\"id\":2,\"brand\":\"MAZERATI\",\"modele\":\"ECLATE\",\"color\":\"GRIS\"},{\"id\":4,\"brand\":\"PEUGEOT\",\"modele\":\"308\",\"color\":\"BLANC\"}]";
		this.restTemplate.delete("/vehicules/3", String.class);
		String withoutDeletedVehicule = this.restTemplate.getForObject("/vehicules", String.class);
		assertEquals(withoutDeletedVehicule, testDeleteOneVehicule);
	}
}
