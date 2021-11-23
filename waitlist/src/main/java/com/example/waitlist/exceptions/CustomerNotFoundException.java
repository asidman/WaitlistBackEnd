package com.example.waitlist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends NullPointerException{
	
	public CustomerNotFoundException(String errorMessage, Long id){
		super(errorMessage);
	}
}
