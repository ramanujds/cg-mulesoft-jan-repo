package com.cg.foodieapp.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import com.cg.foodieapp.dto.ErrorResponse;
import com.cg.foodieapp.exception.DuplicateItemException;
import com.cg.foodieapp.exception.FoodItemNotFoundException;

@RestControllerAdvice
public class FoodItemErrorController {

	@ExceptionHandler(value = {FoodItemNotFoundException.class})
	// @ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorResponse> handleFoodItemNotFoundException(Exception ex, HttpServletRequest request) {
		ErrorResponse body= new ErrorResponse(LocalDateTime.now(),
									HttpStatus.NOT_FOUND.value() , 
									ex.getClass().getSimpleName(), 
									ex.getLocalizedMessage(), 
									request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	}
	
	@ExceptionHandler(value = {DuplicateItemException.class})
	// @ResponseStatus(code = HttpStatus.CONFLICT)
	public ResponseEntity<ErrorResponse> handleDuplicateItemException(Exception ex, HttpServletRequest request) {
		ErrorResponse body= new ErrorResponse(LocalDateTime.now(),
									HttpStatus.CONFLICT.value() , 
									ex.getClass().getSimpleName(), 
									ex.getLocalizedMessage(), 
									request.getRequestURI());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
	}
	
}
