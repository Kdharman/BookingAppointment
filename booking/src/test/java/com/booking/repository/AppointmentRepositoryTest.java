package com.booking.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.booking.entity.Appointment;
import com.booking.entity.Member;
import com.booking.entity.Slot;
import com.booking.entity.VaccinationCenter;

@SpringBootTest
class AppointmentRepositoryTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Test
	public void addAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(123456l, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentRepository.save(app);
	}
	
	@Test
	public void updateAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(123456l, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentRepository.save(app);
	}
	
	@Test
	public void deleteAppointment() {
		Member member = new Member(123, true, true, LocalDate.of(2020, 6, 14), LocalDate.of(2020, 11, 20));
		VaccinationCenter vc = new VaccinationCenter(546, "Center", "Address", "City", "State", "Pincode");
		Appointment app = new Appointment(123456l, 99999999l, LocalDate.of(2020, 12, 5), true, member, vc, Slot.slot1);
		appointmentRepository.delete(app);
	}
	
	@Test
	public void getAppointment() {
		appointmentRepository.getById(123456l);
	}
}
