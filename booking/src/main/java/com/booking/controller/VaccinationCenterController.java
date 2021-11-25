package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.VaccinationCenter;
import com.booking.service.VaccinationCenterService;

@RestController
@RequestMapping(value = "/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired
	private VaccinationCenterService vaccinationCenterService;
	
	@PostMapping("/add")
	public VaccinationCenter addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		return vaccinationCenterService.addVaccineCenter(vaccinationCenter);
	}
	
	@PutMapping("/update")
	public VaccinationCenter updateVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		return vaccinationCenterService.updateVaccineCenter(vaccinationCenter);
	}
	
	@DeleteMapping("/delete")
	public void deleteVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		vaccinationCenterService.deleteVaccineCenter(vaccinationCenter);
	}
	
	@GetMapping("/allvaccinationcenters")
	public List<VaccinationCenter> getAllVaccinationCenters() {
		return vaccinationCenterService.getAllVaccineCenters();
	}
}
