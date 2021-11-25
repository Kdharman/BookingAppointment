package com.booking.entity;

public enum Slot {

	slot1("9 am - 10 am"),
	slot2("9 am - 10 am"),
	slot3("9 am - 10 am"),
	slot4("9 am - 10 am"),
	slot5("9 am - 10 am"),
	slot6("9 am - 10 am"),
	slot7("9 am - 10 am"),
	slot8("9 am - 10 am"),
	slot9("9 am - 10 am");

	private String timeslot;
	
	private Slot(String timeslot) {
		this.timeslot = timeslot;
	}
	
	public String getTimeslot() {
		return timeslot;
	}
}
