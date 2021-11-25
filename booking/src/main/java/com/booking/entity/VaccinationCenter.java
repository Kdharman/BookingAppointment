package com.booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vaccination_Center")
public class VaccinationCenter {

	@Id
	@Column(name = "Center_Code")
	private int code;
	@Column(name = "Center_Name")
	private String centername;
	@Column(name = "Center_Address")
	private String address;
	@Column(name = "Center_City")
	private String city;
	@Column(name = "Center_State")
	private String state;
	@Column(name = "Center_Pincode")
	private String pincode;
	
	public VaccinationCenter(int code, String centername, String address, String city, String state, String pincode) {
		super();
		this.code = code;
		this.centername = centername;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
