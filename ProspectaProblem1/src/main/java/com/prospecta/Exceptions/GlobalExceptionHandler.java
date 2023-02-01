package com.prospecta.Exceptions;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<AllErrorDetails> getException(Exception e,WebRequest req){
		
		AllErrorDetails error=new AllErrorDetails(LocalTime.now(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<AllErrorDetails>(error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<AllErrorDetails> getCategoryException(CategoryException ce,WebRequest req){
		
		AllErrorDetails error=new AllErrorDetails(LocalTime.now(), ce.getMessage(), req.getDescription(false));
		return new ResponseEntity<AllErrorDetails>(error, HttpStatus.BAD_REQUEST);
	}
	
}
