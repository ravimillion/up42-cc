package com.up42.coding.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionNotFound extends RuntimeException {	
	private static final long serialVersionUID = 1L;
	public static final String MSG_FEATURE_NOT_FOUND = "Feature not found";
	public static final String MSG_FEATURE_NO_QUICKLOOK = "Feature does not have a quicklook";

	public ExceptionNotFound(String message) {
		super(message);
	}
}
