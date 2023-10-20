package com.training.exceptions;

import java.time.LocalDateTime;

// is a relationship  => is a and has a
public class RangeCheckException extends Exception {

	
	private String errorCode;
	private String message;
	private LocalDateTime time;
	
	public RangeCheckException(String errorCode, String message, LocalDateTime time) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.time = time;
	}

	@Override
	public String getMessage() {

		return this.errorCode+","+this.message+","+this.time;
	}
	
	
}
