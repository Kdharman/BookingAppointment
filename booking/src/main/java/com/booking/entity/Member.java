package com.booking.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Member")
public class Member {

	@Id
	@Column(name = "Member_Id")
	private int memberid;
	@Column(name = "Dose1_Status")
	private boolean dose1status;
	@Column(name = "dose2_Status")
	private boolean dose2status;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@Column(name = "dose1_Date")
	private LocalDate dose1date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@Column(name = "dose2_Date")
	private LocalDate dose2date;
	
	public Member(int memberid, boolean dose1status, boolean dose2status, LocalDate dose1date, LocalDate dose2date) {
		super();
		this.memberid = memberid;
		this.dose1status = dose1status;
		this.dose2status = dose2status;
		this.dose1date = dose1date;
		this.dose2date = dose2date;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public boolean isDose1status() {
		return dose1status;
	}
	public void setDose1status(boolean dose1status) {
		this.dose1status = dose1status;
	}
	public boolean isDose2status() {
		return dose2status;
	}
	public void setDose2status(boolean dose2status) {
		this.dose2status = dose2status;
	}
	public LocalDate getDose1date() {
		return dose1date;
	}
	public void setDose1date(LocalDate dose1date) {
		this.dose1date = dose1date;
	}
	public LocalDate getDose2date() {
		return dose2date;
	}
	public void setDose2date(LocalDate dose2date) {
		this.dose2date = dose2date;
	}
}
