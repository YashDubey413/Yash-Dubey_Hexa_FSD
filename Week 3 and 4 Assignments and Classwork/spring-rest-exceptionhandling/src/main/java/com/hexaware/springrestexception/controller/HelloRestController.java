package com.hexaware.springrestexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping("/div/{num1}/{num2}")
	public String divNumbers(@PathVariable int num1,@PathVariable int num2) {
		int result=num1/num2;
		
		return "Div of numbers is: "+result;
		
	}
	
//	@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED,reason="Sorry can't divide by zero")
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public void exceptionHandler() {
//		
//		System.out.println("Handled");
//	}
	
	
	
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED,reason="Sorry can't divide by zero")
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ResponseEntity<String> exceptionHandler1() {
//		
//		System.out.println("Handled");
//		
//		return new ResponseEntity<String>("Number cant be div by zero",HttpStatus.BAD_GATEWAY);
//	}
	
	
}
