package com.booking.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "vaccination_appointment")
public class Appointment {

	@Id
	@Column(name = "Booking_Id")
	private long bookingid;
	@Column(name = "Mobile_Number")
	private long mobileno;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@Column(name = "Date_Of_Booking")
	private LocalDate dateofbooking;
	@Column(name = "Booking_Status")
	private boolean bookingstatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Member member;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VaccinationCenter vaccinationCenter;
	
	@Enumerated(EnumType.STRING)
	private Slot slot;

	public Appointment(long bookingid, long mobileno, LocalDate dateofbooking, boolean bookingstatus, Member member,
			VaccinationCenter vaccinationCenter, Slot slot) {
		super();
		this.bookingid = bookingid;
		this.mobileno = mobileno;
		this.dateofbooking = dateofbooking;
		this.bookingstatus = bookingstatus;
		this.member = member;
		this.vaccinationCenter = vaccinationCenter;
		this.slot = slot;
	}

	public Appointment() {
		super();
	}

	public long getBookingid() {
		return bookingid;
	}

	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public LocalDate getDateofbooking() {
		return dateofbooking;
	}

	public void setDateofbooking(LocalDate dateofbooking) {
		this.dateofbooking = dateofbooking;
	}

	public boolean isBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(boolean bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}
}
