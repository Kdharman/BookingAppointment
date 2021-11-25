package com.booking.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.booking.entity.Appointment;

@Component
public interface AppointmentService {

	public Appointment addAppointment(Appointment app);
	public Appointment updateAppointment(Appointment app);
	public void deleteAppointment(Appointment app);
	public Appointment getAppointment(long bookingid);
	public List<Appointment> getAllAppointment();
}
