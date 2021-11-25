package com.booking.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.booking.entity.VaccinationCenter;

@SpringBootTest
class VaccinationCenterRepositoryTest {
	
	@Autowired
	private VaccinationCenterRepository vaccinationCenterRepository;
	
	@Test
	public void addVaccinationCenter() {
		VaccinationCenter vc = new VaccinationCenter(10, "Center", "Address", "City", "State", "Pincode");
		vaccinationCenterRepository.save(vc);
	}
}
