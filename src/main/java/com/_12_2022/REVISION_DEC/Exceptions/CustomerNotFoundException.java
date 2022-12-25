package com._12_2022.REVISION_DEC.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}
