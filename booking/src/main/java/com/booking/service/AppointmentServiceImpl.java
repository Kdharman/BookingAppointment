package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Appointment;
import com.booking.exception.BookingException;
import com.booking.repository.AppointmentRepository;


@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment addAppointment(Appointment app) {
		
		if(app.getBookingid() == 0)
			throw new BookingException("Booking Id cannot be zero");
		else if(app.getDateofbooking() == null)
			throw new BookingException("Booking date cannot be empty");

		else if(app.getMobileno() == 0l)
			throw new BookingException("Mobile Number cannot be empty or zero");
		
		else if(app.getMember() == null)
			throw new BookingException("Member cannot be empty");
		
		else if(app.getVaccinationCenter() == null)
			throw new BookingException("Vaccination Center cannot be null or empty");
		
		else if(app.getSlot() == null )
			throw new BookingException("Slot cannot be empty");
		
		try {
			return appointmentRepository.save(app);
		} catch(IllegalArgumentException e) {
			throw new BookingException("Given data has empty values" );
		} catch (Exception e) {
			throw new BookingException("Something went wrong in service layer" + e.getMessage());
		}
	}

	@Override
	public Appointment updateAppointment(Appointment app) {
		try {
			return appointmentRepository.save(app);
		} catch (IllegalArgumentException e) {
			throw new BookingException("Given Booking Id is empty, please check.");
		} catch (java.util.NoSuchElementException e) {
			throw new BookingException("Given Booking Id does not exist in Database" +e.getMessage());
		}
	}

	@Override
	public void deleteAppointment(Appointment app) {
		try {
				appointmentRepository.delete(app);
		} catch (IllegalArgumentException e) {
			throw new BookingException("Given Booking Id is empty, please check.");
		} catch (java.util.NoSuchElementException e) {
			throw new BookingException("Given Booking Id does not exist in Database" +e.getMessage());
		}
	}

	@Override
	public Appointment getAppointment(long bookingid) {
		try {
			return appointmentRepository.findById(bookingid).get();
		} catch (IllegalArgumentException e) {
			throw new BookingException("Given Booking Id is empty, please check.");
		} catch (java.util.NoSuchElementException e) {
			throw new BookingException("Given Booking Id does not exist in Database" +e.getMessage());
		}
	}

	@Override
	public List<Appointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}
}
