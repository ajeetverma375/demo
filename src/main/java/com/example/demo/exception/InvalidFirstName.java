package com.example.demo.exception;

public class InvalidFirstName extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public InvalidFirstName() {
	}

	public InvalidFirstName(String msg) {
		super(msg);
	}
}
