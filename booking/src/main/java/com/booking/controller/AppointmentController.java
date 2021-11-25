package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.Appointment;
import com.booking.exception.BookingException;
import com.booking.exception.ControllerBookingException;
import com.booking.service.AppointmentService;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addAppointment(@RequestBody Appointment app) {
		try {
			Appointment savedApp = this.appointmentService.addAppointment(app);
			return new ResponseEntity<Appointment>(savedApp, HttpStatus.CREATED);
			} catch (BookingException e) {
				ControllerBookingException ce = new ControllerBookingException(e.getErrorMessage());
				return new ResponseEntity<ControllerBookingException>(ce, HttpStatus.BAD_REQUEST);
			} catch(Exception e) {
			ControllerBookingException ce = new ControllerBookingException("Something went wrong in Controller");
				return new ResponseEntity<ControllerBookingException>(ce,HttpStatus.BAD_REQUEST);
			}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateAppointment(@RequestBody Appointment app) {
		try {
			Appointment updatedApp = this.appointmentService.updateAppointment(app);
			return new ResponseEntity<Appointment>(updatedApp, HttpStatus.OK);
			} catch (BookingException e) {
				ControllerBookingException ce = new ControllerBookingException(e.getErrorMessage());
				return new ResponseEntity<ControllerBookingException>(ce, HttpStatus.BAD_REQUEST);
			} catch(Exception e) {
			ControllerBookingException ce = new ControllerBookingException("Something went wrong in Controller");
				return new ResponseEntity<ControllerBookingException>(ce,HttpStatus.BAD_REQUEST);
			}
	}
	
	@DeleteMapping("/delete")
	public void deleteAppointment(@RequestBody Appointment app) {
		appointmentService.deleteAppointment(app);
	}
	
	@GetMapping("/getappointment/{bookingid}")
	public ResponseEntity<?> getAppointment(@PathVariable long bookingid) {
		try {
			Appointment getApp = this.appointmentService.getAppointment(bookingid);
			return new ResponseEntity<Appointment>(getApp, HttpStatus.OK);
			} catch (BookingException e) {
				ControllerBookingException ce = new ControllerBookingException(e.getErrorMessage());
				return new ResponseEntity<ControllerBookingException>(ce, HttpStatus.BAD_REQUEST);
			} catch(Exception e) {
			ControllerBookingException ce = new ControllerBookingException("Something went wrong in Controller");
				return new ResponseEntity<ControllerBookingException>(ce,HttpStatus.BAD_REQUEST);
			}
	}
	
	@GetMapping("/allappointment")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointment();
	}
}
