package com.booking.exception;

import org.springframework.stereotype.Component;

@Component
public class BookingException extends RuntimeException{

	private String errorMessage;
	private static final long serialVersionUID = 1L;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public BookingException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	public BookingException() {
		super();
	}
}
