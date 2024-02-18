package com.hexaware.springrestexception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ArithmeticException.class})
	//@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="Cant divide by zero")
	public ResponseEntity<String> handleException(ArithmeticException e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
	}
	
}
