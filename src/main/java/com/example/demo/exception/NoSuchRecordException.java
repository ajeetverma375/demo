package com.example.demo.exception;

public class NoSuchRecordException extends RuntimeException 
{
	public NoSuchRecordException()
	{}

    public NoSuchRecordException(String msg)
    {
    	super(msg);
    }
}
