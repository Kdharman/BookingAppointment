package com.booking.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.booking.entity.VaccinationCenter;

@Component
public interface VaccinationCenterService {

	public VaccinationCenter addVaccineCenter(VaccinationCenter center);
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center);
	public void deleteVaccineCenter(VaccinationCenter center);
	//public VaccinationCenter getVaccineCenter(int centerid);
	public List<VaccinationCenter> getAllVaccineCenters();
}
