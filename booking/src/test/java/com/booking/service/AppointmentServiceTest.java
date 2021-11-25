package com.booking.service;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.booking.entity.Appointment;
import com.booking.entity.Member;
import com.booking.entity.Slot;
import com.booking.entity.VaccinationCenter;

@SpringBootTest
class AppointmentServiceTest {

	@Autowired
	private AppointmentService appointmentService;
	
	@Test
	public void addAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(0, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentService.addAppointment(app);
	}
	
	@Test
	public void updateAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(123456l, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentService.updateAppointment(app);
	}
	
	@Test
	public void deleteAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(123456l, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentService.deleteAppointment(app);
	}
	
	@Test
	public void getAppointment() {
		appointmentService.getAppointment(12345l);
	}
	
	@Test
	public void getAllAppointment() {
		appointmentService.getAllAppointment();
	}

}
