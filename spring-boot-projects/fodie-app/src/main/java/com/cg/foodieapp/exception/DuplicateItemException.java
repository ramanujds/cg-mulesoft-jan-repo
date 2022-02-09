package com.cg.foodieapp.exception;

public class DuplicateItemException extends RuntimeException{

	public DuplicateItemException(String message) {
		super(message);
	}
}
