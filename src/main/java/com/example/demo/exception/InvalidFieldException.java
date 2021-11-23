package com.example.demo.exception;

public class InvalidFieldException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidFieldException() {
	}

	public InvalidFieldException(String message) {
		super(message);
	}
}
