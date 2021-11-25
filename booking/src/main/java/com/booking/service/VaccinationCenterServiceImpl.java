package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.VaccinationCenter;
import com.booking.repository.VaccinationCenterRepository;

@Service("vaccinationCenterService")
public class VaccinationCenterServiceImpl implements VaccinationCenterService {

	@Autowired
	private VaccinationCenterRepository vaccinationCenterRepository;
	
	@Override
	public VaccinationCenter addVaccineCenter(VaccinationCenter center) {
		return vaccinationCenterRepository.save(center);
	}

	@Override
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center) {
		return vaccinationCenterRepository.save(center);
	}

	@Override
	public void deleteVaccineCenter(VaccinationCenter center) {
		vaccinationCenterRepository.delete(center);
	}

	@Override
	public List<VaccinationCenter> getAllVaccineCenters() {
		return vaccinationCenterRepository.findAll();
	}
}
